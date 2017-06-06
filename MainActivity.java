package com.example.techgenysis.myapplication102;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText et1,et2;
    String s1,s2;
    int n1,n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn =(Button) findViewById(R.id.ok);
        et1 = (EditText)findViewById(R.id.edit_text1);
        et2 = (EditText)findViewById(R.id.edit_text2);
        setTitle("LogIn");
    }

    public void check(View v)
    {   s1 = et1.getText().toString();
        s2 = et2.getText().toString();
        n1 = s1.indexOf("@");
        n2 = s1.indexOf(".");
        Intent i = new Intent(MainActivity.this,Main2Activity.class);
        if((n1!=-1)&&(n2!=-1))
            {
            i.putExtra("Username",s1);
            i.putExtra("Password",s2);
            startActivity(i);}
        else
        {
            et1.setText("");
            et2.setText("");

        }
    }
}
