package com.example.swimmingtechniques;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class swimmingAdapter extends ArrayAdapter<PlatfFrom> {
    Context context;
    int layoutResourceId;
    List<PlatfFrom> data;
    public swimmingAdapter(Context context,int layoutResourceId, List data){
        super(context, layoutResourceId,data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        PlatfFormHolder holder = null;
        if (row == null){
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId,parent,false);
            holder = new PlatfFormHolder();
            holder.img      = (ImageView)row.findViewById(R.id.image_item1);
            holder.txtTitle = (TextView)row.findViewById(R.id.title_item1);
            row.setTag(holder);
        }
        else {
            holder = (PlatfFormHolder)row.getTag();
        }
        PlatfFrom pf = data.get(position);
        holder.txtTitle.setText(pf.title);
        holder.img.setImageResource(pf.icon);
        return row;
    }

    class PlatfFormHolder{
        ImageView img;
        TextView txtTitle;
    }
}
