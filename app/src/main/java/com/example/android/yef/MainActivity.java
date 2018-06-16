package com.example.android.yef;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView  updatestxt = (TextView) findViewById(R.id.updates);
        updatestxt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent up = new Intent(MainActivity.this,Updates.class);
                startActivity(up);
            }
        });
        TextView  profiletxt = (TextView) findViewById(R.id.Profile);
        profiletxt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pro = new Intent(MainActivity.this,Profile.class);
                startActivity(pro);
            }
        });
        TextView  helptxt = (TextView) findViewById(R.id.Help);
        helptxt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent help = new Intent(MainActivity.this,Help.class);
                startActivity(help);
            }
        });
    }


}
