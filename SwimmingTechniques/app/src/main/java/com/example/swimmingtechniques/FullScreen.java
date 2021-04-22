package com.example.swimmingtechniques;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class   FullScreen extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);

        imageView =(ImageView)findViewById(R.id.imageview);

        getSupportActionBar().hide();
        getSupportActionBar().setTitle("Full Screen Image");
        int a = Position.position ;
       if (a==0) {
           Intent i = getIntent();
           int position = i.getExtras().getInt("id");
           ImageAdapter imageAdapter = new ImageAdapter(this);
           imageView.setImageResource(imageAdapter.imageArray[position]);
       }
        if (a==1) {
            Intent i = getIntent();
            int position = i.getExtras().getInt("id");
            ImageAdapter imageAdapter = new ImageAdapter(this);
            imageView.setImageResource(imageAdapter.imageArray1[position]);
        }
        if (a==2) {
            Intent i = getIntent();
            int position = i.getExtras().getInt("id");
            ImageAdapter imageAdapter = new ImageAdapter(this);
            imageView.setImageResource(imageAdapter.imageArray2[position]);
        }
        if (a==3) {
            Intent i = getIntent();
            int position = i.getExtras().getInt("id");
            ImageAdapter imageAdapter = new ImageAdapter(this);
            imageView.setImageResource(imageAdapter.imageArray3[position]);
        }
        if (a==4) {
            Intent i = getIntent();
            int position = i.getExtras().getInt("id");
            ImageAdapter imageAdapter = new ImageAdapter(this);
            imageView.setImageResource(imageAdapter.imageArray4[position]);
        }
        if (a==5) {
            Intent i = getIntent();
            int position = i.getExtras().getInt("id");
            ImageAdapter imageAdapter = new ImageAdapter(this);
            imageView.setImageResource(imageAdapter.imageArray5[position]);
        }
    }
}