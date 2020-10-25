package com.example.project3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class YearSelector extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year_selector);
    }
    public void onClick(View view) {
        if(R.id.this==R.id.YearToMonth)
            intent i = new Intent(this, MonthSelector.class);
        else if(R.id.this==R.id.YearToSettings)
            intent i = new Intent(this, SettingsScreen.class);
        startActivity(i);
    }
}