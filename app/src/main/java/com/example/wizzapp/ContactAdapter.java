package com.example.wizzapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class ContactAdapter extends BaseAdapter {
    private Context mContext;
    String[] mContactNames;


    public ContactAdapter(Context c, String[] contactNames) {
        mContext = c;
        mContactNames = contactNames;

    }

    public int getCount() {
        return mContactNames.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LinearLayout linearLayout = new LinearLayout(mContext);
        TextView textView;
        ImageView imageView;


       /* if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(350, 350));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }
        */

        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT ));
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);

        imageView = new ImageView(mContext);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(350, 350));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8, 8, 8, 8);

        //imageView.setBackgroundColor(Color.BLACK);
        imageView.setImageResource(R.drawable.ic_mood_black_24dp);


        textView = new TextView(mContext);
        textView.setText(mContactNames[position]);

        linearLayout.addView(textView);
        linearLayout.addView(imageView);

        return linearLayout;
    }

}