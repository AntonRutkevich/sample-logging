package com.rutkevich.sample.logging

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar

public class LoggingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logging)
        setSupportActionBar(findViewById(R.id.toolbar) as Toolbar)
    }

}
