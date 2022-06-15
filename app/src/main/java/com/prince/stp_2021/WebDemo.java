package com.prince.stp_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WebDemo extends AppCompatActivity {

    WebView w;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_demo);

        w=findViewById(R.id.wv);
        w.getSettings().setJavaScriptEnabled(true);
        w.loadUrl("https://www.google.com");
    }
}