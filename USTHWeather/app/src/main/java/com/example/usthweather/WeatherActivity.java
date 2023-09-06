package com.example.usthweather;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = "WeatherActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a new Fragment to be placed in the activity layout
        ForecastFragment f = new ForecastFragment();
        // Add the fragment to the 'container' FrameLayout
        getSupportFragmentManager().beginTransaction().add(
                R.id.container, f).commit();

        Log.i(TAG, "onCreate: Created");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i(TAG, "onStart: Started");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i(TAG, "onResume: Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i(TAG, "onPause: Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i(TAG, "onStop: Stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i(TAG, "onDestroy: Destroyed");
    }
}