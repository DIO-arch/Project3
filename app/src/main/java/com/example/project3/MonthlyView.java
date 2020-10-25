package com.example.project3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MonthlyView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monthly_view);
    }
    public void onClick(View view) {
        if (R.id.this == R.id.MonthlyToSettings)
            intent i = new Intent(this, SettingsScreen.class);
        else if (R.id.this == R.id.MonthlyToMonth)
            intent i = new Intent(this, MonthSelector.class);
        else if (R.id.this == R.id.MonthlyToDaily)
            intent i = new Intent(this, DailyView.class);
        startActivity(i);
    }
}