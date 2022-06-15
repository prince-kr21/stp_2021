package com.prince.stp_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerDemo extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner sp;
    String[] country={"--Selected","India","USA","Indonesia","China","Hong Kong"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_demo);
        sp=findViewById(R.id.spinner);
        sp.setOnItemSelectedListener(this);

        ArrayAdapter<String> ad= new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,country);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(ad);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(),country[position],Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}