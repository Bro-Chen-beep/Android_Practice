package com.example.user.listviewexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class myadapter extends ArrayAdapter<String> {

    public myadapter(Context context,String [] values){
        super(context,R.layout.row_layout2,values);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater theinflater = LayoutInflater.from(getContext());
        View theview = theinflater.inflate(R.layout.row_layout2,parent,false);
        String tvshow = getItem(position);
        TextView thetextview = (TextView) theview.findViewById(R.id.textview1);
        thetextview.setText(tvshow);
        ImageView theimageview = (ImageView) theview.findViewById(R.id.imageview1);
        theimageview.setImageResource(R.drawable.dot);
        return theview;
    }
}
