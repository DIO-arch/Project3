package com.example.project3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class TimeSelector extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_selector);
    }
    public void onClick(View view) {
        if(R.id.this==R.id.TimeToMain)
            intent i = new Intent(this, MainActivity.class);
        else if(R.id.this==R.id.TimeToDaily)
            intent i = new Intent(this, DailyView.class);
        startActivity(i);
    }
}