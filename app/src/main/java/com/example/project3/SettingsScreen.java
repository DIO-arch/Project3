package com.example.project3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class SettingsScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_screen);
    }
    public void onClick(View view) {
        if(R.id.this==R.id.SettingsToMonth)
            intent i = new Intent(this, MonthSelector.class);
        else if(R.id.this==R.id.SettingsToMonthly)
            intent i = new Intent(this, MonthlyView.class);
        else if(R.id.this==R.id.SettingsToMain)
            intent i = new Intent(this, MonthlyView.class);
        startActivity(i);
    }
}