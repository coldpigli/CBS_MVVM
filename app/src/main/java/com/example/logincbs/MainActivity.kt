package com.example.logincbs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.Thread.sleep

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_LoginCBS)
        sleep(2000)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}