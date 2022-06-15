package com.prince.stp_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;

public class IntentDemo extends AppCompatActivity {
    Button c;
    Button s;
    Button se;
    Button m;
    Button co;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_demo);

        c=findViewById(R.id.button);

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:198"));
                startActivity(obj);
            }
        });

        s=findViewById(R.id.button2);
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj=new Intent(Intent.ACTION_SENDTO,Uri.parse("sms:8935838058"));
                obj.putExtra("sms_body","hello pal!!");
                startActivity(obj);
            }
        });

        se=findViewById(R.id.button4);
        se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj =new Intent(Intent.ACTION_WEB_SEARCH);
                obj.putExtra(SearchManager.QUERY,"android studio");
                startActivity(obj);

            }
        });

        m=findViewById(R.id.button5);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:Patna"));
                startActivity(obj);
            }
        });

        co=findViewById(R.id.button6);
        co.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
                startActivity(obj);
            }
        });
    }
}