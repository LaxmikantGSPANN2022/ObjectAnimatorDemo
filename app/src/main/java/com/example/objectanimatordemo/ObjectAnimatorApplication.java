package com.example.objectanimatordemo;

import android.app.Application;
import android.widget.Toast;

public class ObjectAnimatorApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(getApplicationContext(), "Hello in Object Animator!", Toast.LENGTH_SHORT).show();
    }
}
