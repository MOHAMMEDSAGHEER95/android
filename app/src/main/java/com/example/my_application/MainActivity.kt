package com.example.my_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    var TAG = "MainActivity";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "Activity oncreate started")
    }

    override fun onStart() {
        super.onStart();
        Log.d(TAG, "Activity onStart started");
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Activity onPause started");
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Activity onDestroy started");
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Activity onResume started");
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Activity onRestart started");
    }




}