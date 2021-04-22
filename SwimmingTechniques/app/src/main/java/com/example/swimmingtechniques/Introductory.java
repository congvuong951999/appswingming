package com.example.swimmingtechniques;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class Introductory extends AppCompatActivity {
    ImageView backgroud;
    LottieAnimationView lottieAnimationView;
    private static int SPLASH_SCREEN = 4500;

    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introductory);
        backgroud = findViewById(R.id.imageView);
        lottieAnimationView = findViewById(R.id.introductory);

        backgroud.animate().translationY(-2500).setDuration(1000).setStartDelay(4000);
        lottieAnimationView.animate().translationY(1500).setDuration(1000).setStartDelay(4000);
        Intent start = new Intent(this,MainActivity.class);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(start);
                finish();
            }
        },SPLASH_SCREEN);
    }
}