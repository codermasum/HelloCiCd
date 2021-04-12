package com.example.hellocicd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // fixing yaml file error 2nd
        setContentView(R.layout.activity_main)
        // We have created a Test branch.
    }
}