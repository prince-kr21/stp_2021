package com.prince.stp_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoCompleteDemo extends AppCompatActivity {
    AutoCompleteTextView act;
    String[] arr={"Android","Ascii","C","C++","Big Data","binary","Python","Perl","Java","Advance_Java"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_demo);

        act = findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String> ad = new ArrayAdapter<>(this, android.R.layout.select_dialog_item,arr);

        act.setThreshold(1);
        act.setAdapter(ad);
        act.setTextColor(Color.RED);
    }
}