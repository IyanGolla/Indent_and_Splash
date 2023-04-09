package com.example.indentandsplash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        t1 = (TextView) findViewById(R.id.changetext);
        String newString;

        if (savedInstanceState == null) {

            Bundle extras = getIntent().getExtras();

            if(extras == null) {

                newString= "Empty";

            } else {

                newString= extras.getString("STRING_I_NEED");

            }

        } else {

            newString= (String) savedInstanceState.getSerializable("STRING_I_NEED");

        }

        t1.setText(newString);

    }



}