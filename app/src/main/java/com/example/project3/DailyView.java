package com.example.project3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class DailyView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_view);
    }
    public void onClick(View view){
        if(R.id.this==R.id.DailyToEdit)
        intent i = new Intent(this, EditMettings.class);
        else
            if(R.id.this == R.id.DailyToMonthly)
                intent i = new Intent(this, MonthlyView.class);
        startActivity(i);
    }
}