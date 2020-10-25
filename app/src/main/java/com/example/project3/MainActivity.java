package com.example.project3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view) {
        if(R.id.this==R.id.MainToMonthly)
        intent i = new Intent(this, MonthlyView.class);
        else
            if(R.id.this==R.id.MainToSettings)
            intent i = new Intent(this, SettingsScreen.class);
        startActivity(i);
    }
}