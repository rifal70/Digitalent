package com.application.digitalent.myapps.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.application.digitalent.myapps.R;

public class SplashScreen extends AppCompatActivity {
    private int delayLoading = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent Login = new Intent(SplashScreen.this, Login.class);
                startActivity(Login);
                finish();
            }
        }, delayLoading);

    }
}
