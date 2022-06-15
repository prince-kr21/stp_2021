package com.prince.stp_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MyDataBaseLogin extends AppCompatActivity {
    SQLiteDatabase db;
    EditText et1,et2;
    Button log,reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_data_base_login);
        db=openOrCreateDatabase("stp",MODE_PRIVATE,null);

        et1 =findViewById(R.id.editText2);
        et2=findViewById(R.id.editText3);
        log=findViewById(R.id.login);
        reg=findViewById(R.id.reg);

        db.execSQL("create table IF NOT EXISTS student(name varchar(20),password varchar (20),city varchar(20),gender varchar(20),mob bigint)");

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = et1.getText().toString();
                String p = et2.getText().toString();
                Cursor c = db.rawQuery("select name,password from student where name='" + n + "' and password='" + p + "'", null);

                if (c.moveToNext())
                {
                    Intent ob=new Intent(MyDataBaseLogin.this,ShowRecord.class);
                    ob.putExtra("x",n);
                    startActivity(ob);

                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Login failed please enter correct name and password",Toast.LENGTH_LONG).show();
                }
            }
        });

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(MyDataBaseLogin.this,Reg.class);
                startActivity(ob);
            }
        });
    }
}