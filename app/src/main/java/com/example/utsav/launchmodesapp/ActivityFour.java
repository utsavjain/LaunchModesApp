package com.example.utsav.launchmodesapp;

import android.content.Intent;
import android.os.Bundle;


public class ActivityFour extends ActivityBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Activity = ActivityOne.class;
        intentFlags = Intent.FLAG_ACTIVITY_CLEAR_TOP;
        setButton("backto ActivityOne");
        Logger.d("Act4-2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logger.d("Act4-d");
    }
}
