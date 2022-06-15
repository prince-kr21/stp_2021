package com.prince.stp_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class GridDemo extends AppCompatActivity {

    GridView gvv;
    String arr[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_demo);
        gvv=findViewById(R.id.gv);

        ArrayAdapter<String> ad =new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1,arr);
        gvv.setAdapter(ad);

        gvv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String str = arr[position];
                Toast.makeText(getApplicationContext(),""+str,Toast.LENGTH_LONG).show();

            }
        });
    }
}