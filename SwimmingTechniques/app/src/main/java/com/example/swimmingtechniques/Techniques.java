package com.example.swimmingtechniques;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

public class Techniques extends AppCompatActivity {
    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_techniques);
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

        String b = data.getStringExtra("okk");

      //  System.out.println(a);
        TextView textView  = (TextView) findViewById(R.id.textView);
        textView.setText(" " + b);
        gridView = (GridView)findViewById(R.id.gridview);
        // hien thi
        gridView.setAdapter(new ImageAdapter(this));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),FullScreen.class);
                intent.putExtra("id",position);
                startActivity(intent);
        }

                });

    }
}
