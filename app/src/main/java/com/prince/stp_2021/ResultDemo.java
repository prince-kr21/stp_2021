package com.prince.stp_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultDemo extends AppCompatActivity {
    TextView t;
    Bundle b;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_demo);
        t=findViewById(R.id.textView3);

        b=getIntent().getExtras();

        s=b.getString("str");
        t.setText(s);
    }
}