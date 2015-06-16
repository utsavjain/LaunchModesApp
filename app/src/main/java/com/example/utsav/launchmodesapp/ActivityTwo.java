package com.example.utsav.launchmodesapp;

import android.os.Bundle;


public class ActivityTwo extends ActivityBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Activity = ActivityThree.class;
        setButton("goto ActivityThree");
        Logger.d("Act2----c");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logger.d("Act2----D");
    }
}
