package com.prince.stp_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class RatingDemo extends AppCompatActivity {

    RatingBar rb;
    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_demo);

        rb = findViewById(R.id.ratingBar);
        btn = findViewById(R.id.button3);
        tv = findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=String.valueOf(rb.getRating());
                tv.setText(str);
            }
        });
    }
}
