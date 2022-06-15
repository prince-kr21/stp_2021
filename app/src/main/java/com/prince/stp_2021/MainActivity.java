package com.prince.stp_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    String[] ar ={"List Demo Activity","Grid View Demo","Web View Demo","Intent Demo","Radio Demo","Rating Demo","Check Demo","Spinner Demo","Auto Complete Demo","Alert Demo","Sensor Demo","Custom Demo","Service Demo","My Music Service","DataBase Demo"};
    Class c[]={ListDemo.class,GridDemo.class,WebDemo.class,IntentDemo.class,RadioDemo.class,RatingDemo.class,CheckDemo.class,SpinnerDemo.class,AutoCompleteDemo.class,AlertDemo.class,SensorDemo.class,CustomDemo.class,ServiceDemo.class,MyMusicDemo.class,MyDataBaseLogin.class};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lv);

        ArrayAdapter<String> ad= new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, ar);
        lv.setAdapter(ad);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String str=ar[position];
//                Toast.makeText(getApplicationContext()," "+str,Toast.LENGTH_LONG).show();
                try{
                    Intent obj = new Intent(MainActivity.this,c[position]);
                    startActivity(obj);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
}