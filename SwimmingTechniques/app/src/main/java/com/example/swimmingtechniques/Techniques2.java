package com.example.swimmingtechniques;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Techniques2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_techniques2);

        // phần  chuyển sang acti mới
        ActionBar actionBar = getSupportActionBar();
        setContentView(R.layout.activity_techniques);
        if(actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowCustomEnabled(true);
        }

        // xử lý nhận active lấy giá trị title
        Intent intent = getIntent();
        String aTitle = intent.getStringExtra("title");
        actionBar.setTitle(aTitle);

        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); // Hiệu ứng chuyển trang
        Intent data = getIntent();

        String a = data.getStringExtra("ok1");
        String b = data.getStringExtra("okk1");
        int c = data.getIntExtra("imgStyle",0);
        System.out.println(a);
        TextView textView  = (TextView) findViewById(R.id.textView);

        textView.setText(a + " " + b);

    }
}