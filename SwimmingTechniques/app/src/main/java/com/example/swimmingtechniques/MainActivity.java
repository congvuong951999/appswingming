package com.example.swimmingtechniques;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    int mImages [] = {R.drawable.img2, R.drawable.phao };
    String mTitle [] = {"Các kiểu bơi cơ bản ","Những lưu ý trước khi đi bơi"};
    Animation right ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // hiệu ứng
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        right = AnimationUtils.loadAnimation(this ,R.anim.anii);
        listView = findViewById(R.id.ListView);
        listView.setAnimation(right);
//         hiệu ứng nhấp nháy
//        Animation mAnimation = new AlphaAnimation(1, 0);
//        mAnimation.setDuration(1500);
//        mAnimation.setRepeatCount(Animation.INFINITE);
//        mAnimation.setRepeatMode(Animation.REVERSE); listView.startAnimation(mAnimation);
//          tạo adapter class

        MyAdapter adapter = new MyAdapter(this, mImages, mTitle);
        // xoá thanh gạch ngang
        listView.setDivider(null);
        listView.setAdapter(adapter);
        // setup Onclick item
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0 ){

                    Intent intent = new Intent(getApplicationContext(),SwimmingStyle.class);
                    intent.putExtra("title", mTitle[0]);
//                    intent.putExtra("positon","" + 0);
                    startActivity(intent);
                }else if(position == 1 ){

                    Intent intent = new Intent(getApplicationContext(),note.class);
                    intent.putExtra("title", mTitle[1]);
//                    intent.putExtra("positon","" + 1);
                    startActivity(intent);
                }
            }
        });
    }

    public class MyAdapter extends ArrayAdapter<String>{
        Context context;
        int rImages[];
        String rTitle[];

        MyAdapter (Context c, int imgs[], String title[] ){
            super(c, R.layout.swin1 , title);
            this.context = c;
            this.rImages = imgs;
            this.rTitle = title;
        }
        // LayoutInflater chuyển xml thành view java trong android
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View swin1 = layoutInflater.inflate(R.layout.swin1 , parent, false);
            ImageView imageView = swin1.findViewById(R.id.image_item);
            TextView myTitle    = swin1.findViewById(R.id.title_item);

            // set Resources on views
            imageView.setImageResource(rImages[position]);
            myTitle.setText(rTitle[position]);
            return swin1;
        }
    }

}