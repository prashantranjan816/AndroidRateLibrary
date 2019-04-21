package com.example.android_ratelibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import hotchemi.android.rate.AppRate;

public class RateTheApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_the_app);
        //        ========================== To apear Rate dilogue box============
        AppRate.with(this)
                .setInstallDays(1) // after install day of app bydefult 10days
                .setLaunchTimes(3) //after how many times lunched the app bydefult 10times
                .setRemindInterval(2) // after select remain me when to remaind
                .monitor();

        AppRate.showRateDialogIfMeetsConditions(this);
        AppRate.with(this).showRateDialog(this);  // It will show rate dilog imodiate



    }
}
