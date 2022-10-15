package com.olisemeka.remybikes.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.olisemeka.remybikes.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_RemyBikes)
        setContentView(R.layout.activity_main)
    }
}