package com.example.log_inscreen.presentation.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.log_inscreen.R

/*
    TODO:
        1. Create basic design (two edit text fields and two error messages)
        2. Write CheckFieldsUseCase()
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}