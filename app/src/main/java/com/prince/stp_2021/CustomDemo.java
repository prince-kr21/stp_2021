package com.prince.stp_2021;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class CustomDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_demo);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.xyz,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.rd:
                Toast.makeText(getApplicationContext(),"RED",Toast.LENGTH_LONG).show();
                break;

            case R.id.gd:
                Toast.makeText(getApplicationContext(),"GREEN",Toast.LENGTH_LONG).show();
                break;

            case R.id.bd:
                Toast.makeText(getApplicationContext(),"BLACK",Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}