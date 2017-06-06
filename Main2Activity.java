package com.example.techgenysis.myapplication102;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckedTextView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView TV1,TV2;
    String s1,s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("LoginInfo");
        Intent i = getIntent();
        s1 = i.getExtras().getString("Username","");
        s2 = i.getExtras().getString("Password","");

        TV1 = (TextView) findViewById(R.id.tv1);
        TV2 = (TextView) findViewById(R.id.tv2);

        TV1.setText(s1);
        TV2.setText(s2);



    }
}
