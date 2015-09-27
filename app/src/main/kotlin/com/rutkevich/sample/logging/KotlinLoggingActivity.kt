package com.rutkevich.sample.logging

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar

public class KotlinLoggingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logging)
        setSupportActionBar(findViewById(R.id.toolbar) as Toolbar)

        logRegularMessage()
        logComposedMessage()
    }

    private fun logRegularMessage() {
        logD { "Regular message" }
    }

    private fun logComposedMessage() {
        logD { "Composed " + expensiveToCompute() }
    }

    private fun expensiveToCompute(): String {
        try {
            Thread.sleep(2000)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }

        return "result"
    }
}
