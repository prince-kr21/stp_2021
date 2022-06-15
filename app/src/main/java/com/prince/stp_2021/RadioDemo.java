package com.prince.stp_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class RadioDemo extends AppCompatActivity {
    LinearLayout lv;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_demo);

        lv=findViewById(R.id.ll);
        rg=findViewById(R.id.r);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.re:
                        //lv.setBackgroundColor(Color.RED);
                        lv.setBackgroundResource(R.mipmap.abcde);
                        break;

                    case R.id.ge:
                        //lv.setBackgroundColor(Color.GREEN);
                        Intent obj=new Intent(RadioDemo.this,GridDemo.class);
                        startActivity(obj);
                        break;
                }
            }
        });
    }
}