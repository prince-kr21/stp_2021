package com.prince.stp_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Reg extends AppCompatActivity {
    SQLiteDatabase db;
    EditText ed1,ed2,ed3,ed4;
    Button btn;
    RadioGroup rg;
    RadioButton rb;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        db=openOrCreateDatabase("stp",MODE_PRIVATE,null);
        ed1=findViewById(R.id.editTextTextPersonName);
        ed2=findViewById(R.id.editTextTextPersonName2);
        ed3=findViewById(R.id.editTextTextPersonName3);
        ed4=findViewById(R.id.editTextTextPersonName4);

        btn=findViewById(R.id.reg);

        rg=findViewById(R.id.rg);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n= ed1.getText().toString();
                String p=ed2.getText().toString();
                String c=ed3.getText().toString();
                String m=ed4.getText().toString();

                i=rg.getCheckedRadioButtonId();
                rb=findViewById(i);
                String g=rb.getText().toString();

                db.execSQL("insert into student values('"+n+"','"+p+"','"+c+"','"+g+"','"+m+"')");
                Intent ob=new Intent(Reg.this,MyDataBaseLogin.class);
                startActivity(ob);
            }
        });
    }

}