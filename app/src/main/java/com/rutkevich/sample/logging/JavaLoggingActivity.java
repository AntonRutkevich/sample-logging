package com.rutkevich.sample.logging;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.rutkevich.sample.logging.loggers.MyLogger;

public class JavaLoggingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logging);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));

        logRegularMessage();
        logComposedMessage();
        logUsingIfStatement();
    }

    private void logRegularMessage() {
        MyLogger.d("Regular message");
    }

    private void logComposedMessage() {
        MyLogger.d("Composed " + expensiveToCompute());
    }

    private void logUsingIfStatement() {
        if (BuildConfig.DEBUG) {
            MyLogger.d("Composed " + expensiveToCompute());
        }
    }

    private String expensiveToCompute() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "result";
    }

}
