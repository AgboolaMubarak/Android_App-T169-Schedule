package com.example.traint169;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitBooking(View view){
        Intent intent = new Intent(this, BookingActivity.class);
        startActivity(intent);

    }
    public void checkSchedule(View view){
        Intent intent = new Intent(this, ScheduleActivity.class);
        startActivity(intent);

    }



}