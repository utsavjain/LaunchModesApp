package com.example.utsav.launchmodesapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;


public class ActivityBase extends ActionBarActivity {

    Button button;
    Class Activity = ActivityTwo.class;
    int intentFlags = -1;

    public void setButton(String txt) {
        setContentView(R.layout.activity_main);
        //button=new Button(this,null,R.style.AppTheme);

        button=new Button(this);
        button.setText(txt);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Activity);
                Logger.d("click-1");
                if (intentFlags != -1)
                    i.setFlags(intentFlags);

                startActivity(i);
                Logger.d("click-3");
            }
        });
        addContentView(button, new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        Logger.d("setButton");
    }

}
