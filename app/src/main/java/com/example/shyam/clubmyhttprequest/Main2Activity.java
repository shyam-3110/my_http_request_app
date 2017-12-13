package com.example.shyam.clubmyhttprequest;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Shyam on 11-12-2017.
 */

public class Main2Activity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity2);
        Bundle bundle = getIntent().getExtras();
        String MSG = bundle.getString("regno");

        TextView textView=(TextView) findViewById(R.id.textView2);
        textView.setText(MSG);
    }
}
