package com.example.project3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MonthSelector extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_month_selector);
    }
    public void onClick(View view){
        if(R.id.this==R.id.MonthToMonthly)
        intent i = new Intent(this, MonthlyView.class);
        else
        if(R.id.this==R.id.MonthToYear)
            intent i = new Intent(this, YearSelector.class);
        else
        if(R.id.this==R.id.MonthToSettings)
            intent i = new Intent(this, SettingsScreen.class);
        startActivity(i);
    }
}