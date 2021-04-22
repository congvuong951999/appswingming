package com.example.swimmingtechniques;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.widget.WithHint;

import com.example.swimmingtechniques.R;

import static com.example.swimmingtechniques.R.drawable.boi2;

public class ImageAdapter extends BaseAdapter {
    private Context context;
    public int[] imageArray = {
            R.drawable.e1,R.drawable.e2,R.drawable.e3,R.drawable.e4,
            R.drawable.e5,R.drawable.e6,R.drawable.e7,R.drawable.e8,R.drawable.e9,R.drawable.e10,R.drawable.e11,R.drawable.e12
    };
    public int[] imageArray1 = {
            R.drawable.ts1,R.drawable.ts2,R.drawable.ts3,R.drawable.ts4,
            R.drawable.ts5,R.drawable.ts6,R.drawable.ts7,R.drawable.ts8,R.drawable.ts9,R.drawable.ts10,R.drawable.ts11,R.drawable.ts12
    };
    public int[] imageArray2 = {
            R.drawable.boibuom1,R.drawable.boibuom2,R.drawable.boibuom3,R.drawable.boibuom4,
            R.drawable.boibuom5,R.drawable.boibuom6,R.drawable.boibuom7,R.drawable.boibuom8,R.drawable.boibuom9,
            R.drawable.boibuom10,R.drawable.boibuom11,R.drawable.boibuom12
    };
    public int[] imageArray3 = {
            R.drawable.n1,R.drawable.n2,R.drawable.n3,R.drawable.n4,
            R.drawable.n5,R.drawable.n6,R.drawable.n7,R.drawable.n8,R.drawable.n9,R.drawable.n10,R.drawable.n11,R.drawable.n12
    };
    public int[] imageArray4 = {
            R.drawable.l,R.drawable.l2,R.drawable.l3,R.drawable.l4,
            R.drawable.l5,R.drawable.l6,R.drawable.l7,R.drawable.l8,R.drawable.l9,R.drawable.l10,R.drawable.l11,R.drawable.l1
    };
    public int[] imageArray5 = {
            R.drawable.cho1,R.drawable.cho2,R.drawable.cho3,R.drawable.cho4,
            R.drawable.cho5,R.drawable.cho6,R.drawable.cho7,R.drawable.cho8,R.drawable.cho9,R.drawable.cho10,R.drawable.cho11,R.drawable.cho12
    };

    
    public ImageAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        int a = Position.position ;
        if (a == 0)  return imageArray.length;
        if (a == 1)  return imageArray1.length;
        if (a == 2)  return imageArray2.length;
        if (a == 3)  return imageArray3.length;
        if (a == 4)  return imageArray4.length;
        if (a == 5)  return imageArray5.length;

        return 0;


    }

    @Override
    public Object getItem(int position) {
        // kiem tra
        int a = Position.position ;
        if (a == 0)  return imageArray[position];
        if (a == 1)  return imageArray1[position];
        if (a == 2)  return imageArray2[position];
        if (a == 3)  return imageArray3[position];
        if (a == 4)  return imageArray4[position];
        if (a == 5)  return imageArray5[position];

        return 0;

    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(context);
        int a = Position.position ;
        switch (a){
            case 0: imageView.setImageResource(imageArray[position]); break;
            case 1: imageView.setImageResource(imageArray1[position]); break;
            case 2: imageView.setImageResource(imageArray2[position]); break;
            case 3: imageView.setImageResource(imageArray3[position]); break;
            case 4: imageView.setImageResource(imageArray4[position]); break;
            case 5: imageView.setImageResource(imageArray5[position]); break;

        }
        System.out.println(" vi tri vưa an"+a);

        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(340,350));
        return imageView;
    }
}
