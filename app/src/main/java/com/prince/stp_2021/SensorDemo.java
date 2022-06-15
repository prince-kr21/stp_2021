package com.prince.stp_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SensorDemo extends Activity implements SensorEventListener {
    RelativeLayout r;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_demo);

        r=findViewById(R.id.rl);
        tv=findViewById(R.id.textView4);

        SensorManager sm=(SensorManager) getSystemService(SENSOR_SERVICE);
        int i=Sensor.TYPE_ORIENTATION;
        Sensor s=sm.getDefaultSensor(i);
        sm.registerListener(this,s,sm.SENSOR_DELAY_NORMAL);
    }


    @Override
    public void onSensorChanged(SensorEvent event) {
        float data[]=event.values;
        float x= data[0];
        float y=data[1];
        float z=data[2];
        String str="Orientation Sensor\n";
        str=str+"\nPitch = "+x;
        str=str+"\nRoll = "+y ;
        str=str+"\nAzimuth = "+z;

        tv.setText(str);
        r.setBackgroundColor(Color.rgb((int)x,(int)y,(int)z));

    }  

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}