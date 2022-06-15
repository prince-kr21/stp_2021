package com.prince.stp_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowRecord extends AppCompatActivity {
    TextView tv,tvr;
    Button up,de,se;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_record);
        db=openOrCreateDatabase("stp",MODE_PRIVATE,null);

        tv=findViewById(R.id.textView6);
        tvr=findViewById(R.id.textView7);
        up=findViewById(R.id.button13);
        de=findViewById(R.id.button14);
        se=findViewById(R.id.button15);

        Bundle ob=getIntent().getExtras();
        String name=ob.getString("x");
        tv.setText("Welcome Mr. "+name);

        Cursor c=db.rawQuery("select *from student",null);
        String data= "Student Record :- \n";
        while(c.moveToNext())
        {
            data =data+c.getString(0)+"  "+c.getString(1)+"  "+c.getString(2)+"  "+c.getString(3)+"  "+c.getString(4)+"\n";
        }
        tvr.setText(data);

        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(ShowRecord.this,UpdateRecord.class);
                startActivity(ob);


            }
        });

        de.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob= new Intent(ShowRecord.this,DeleteRecord.class);
                startActivity(ob);
            }
        });

        se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(ShowRecord.this,SearchRecord.class);
                startActivity(ob);

            }
        });
    }
}