package com.example.utsav.launchmodesapp;

import android.os.Bundle;


public class ActivityThree extends ActivityBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Activity = ActivityFour.class;
        setButton("goto ActivityFour");
        Logger.d("Act3-c");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logger.d("Act3----D");
    }
}
