package com.prince.stp_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SearchRecord extends AppCompatActivity {
    SQLiteDatabase db;
    EditText et;
    Button bt;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_record);

        db=openOrCreateDatabase("stp",MODE_PRIVATE,null);
        et=findViewById(R.id.editTextTextPersonName6);
        bt=findViewById(R.id.button17);
        tv=findViewById(R.id.textView8);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=et.getText().toString();
                Cursor c=db.rawQuery("select *from student where name ='"+name+"'",null);
                String data ="Record is :\n";
                while (c.moveToNext()){
                    data=data+c.getString(0)+"  "+c.getString(1)+"  "+c.getString(2)+"  "+c.getString(3)+"  "+c.getString(4)+"\n";

                }
                tv.setText(data);
            }
        });
    }
}