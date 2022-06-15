package com.prince.stp_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyMusicDemo extends Activity implements View.OnClickListener {
    Button play,stop;
    Intent ob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_music_demo);
        play=findViewById(R.id.button11);
        stop=findViewById(R.id.button12);

        play.setOnClickListener(this);
        stop.setOnClickListener(this);
        ob=new Intent(MyMusicDemo.this,MusicDemo.class);
    }

    @Override
    public void onClick(View v) {
        if(v==play){
            startService(ob);
        }else if(v==stop){
            stopService(ob);
        }
    }
}