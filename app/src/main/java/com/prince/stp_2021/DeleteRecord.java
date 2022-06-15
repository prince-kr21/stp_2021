package com.prince.stp_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DeleteRecord extends AppCompatActivity {
    EditText ed1;
    Button b;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_record);

        db=openOrCreateDatabase("stp",MODE_PRIVATE,null);
        ed1=findViewById(R.id.editTextTextPersonName5);
        b=findViewById(R.id.button16);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n =ed1.getText().toString();
                db.execSQL("delete from student where name='"+n+"'");
                Intent ob=new Intent(DeleteRecord.this,ShowRecord.class);
                startActivity(ob);
            }
        });
    }
}