package com.example.objectanimatordemo;

import android.app.Application;
import android.widget.Toast;

public class ObjectAnimatorWorldApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(getApplicationContext(), "Hello in Object Animator For World", Toast.LENGTH_SHORT).show();
    }
}
