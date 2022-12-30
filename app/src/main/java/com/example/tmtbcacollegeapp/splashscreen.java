package com.example.tmtbcacollegeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import com.airbnb.lottie.LottieAnimationView;

public class splashscreen extends AppCompatActivity {

    LottieAnimationView anmView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        anmView = findViewById(R.id.anmView);

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                anmView.playAnimation();
                startActivity(new Intent(splashscreen.this,MainActivity.class));
                finish();
            }
        },5000);
    }
}