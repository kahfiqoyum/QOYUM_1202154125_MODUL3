package com.example.qoyumalkahfi.qoyum_1202154125_modul3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent a = new Intent(SplashScreen.this, Login.class);
                startActivity(a);
                finish();
            }
        }, 4000);
    }
}