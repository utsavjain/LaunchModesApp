package com.example.utsav.launchmodesapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;


public class ActivityOne extends ActivityBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setButton("goto ActivityTwo");
        Logger.d("Act1-c");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Toast.makeText(this, "welcome back", Toast.LENGTH_LONG).show();
        Logger.d("Act1-New Intent");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logger.d("Act1-d");
    }
}
