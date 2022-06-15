package com.prince.stp_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class CheckDemo extends AppCompatActivity {

    Button btn;
    TextView tv;
    CheckBox cbtea,cbcoffee,cbdrink,cbpizza;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_demo);

        btn=findViewById(R.id.button8);
        tv=findViewById(R.id.textView2);
        cbtea=findViewById(R.id.checkBox);
        cbpizza=findViewById(R.id.checkBox2);
        cbcoffee=findViewById(R.id.checkBox3);
        cbdrink=findViewById(R.id.checkBox4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int amount=0;
                StringBuilder sb=new StringBuilder();
                sb.append("Selected Items :-\n");
                if(cbtea.isChecked()){
                    sb.append("\nTea=Rs20");
                    amount=amount+20;
                }
                if(cbcoffee.isChecked()){
                    sb.append("\nCoffee=Rs60");
                    amount=amount+60;
                }
                if(cbpizza.isChecked()){
                    sb.append("\nPizza=Rs300");
                    amount=amount+300;
                }
                if(cbdrink.isChecked()){
                    sb.append("\nCold Drink=Rs40");
                    amount=amount+40;
                }
                if(amount==0){
                    sb.append("You do not ordered anything");
                }
                sb.append("\n-\n-\n-\n Total amount = Rs"+amount);
                //tv.setText(sb);

                Intent obj= new Intent(CheckDemo.this,ResultDemo.class);
                obj.putExtra("str",sb.toString());
                startActivity(obj);
            }
        });
    }
}