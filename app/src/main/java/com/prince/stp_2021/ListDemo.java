package com.prince.stp_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListDemo extends ListActivity {
    String ar[]={"Example1","Example2","Example3","Example4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_list_demo);

        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,ar));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        String str= ar[position];
        Toast.makeText(getApplicationContext(),""+str,Toast.LENGTH_LONG).show();
    }
}