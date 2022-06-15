package com.prince.stp_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ServiceDemo extends AppCompatActivity {
    Button strt,stp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_demo);

        strt=findViewById(R.id.button9);
        stp=findViewById(R.id.button10);

        strt.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {
                Intent obj = new Intent(ServiceDemo.this,Myservice.class);
                startService(obj);
                }
        });

        stp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj = new Intent(ServiceDemo.this,Myservice.class);
                stopService(obj);
            }
        });
    }
}