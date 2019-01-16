package com.example.ntobekozwane.lingo;

import android.app.Activity;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class
WordAdapter extends ArrayAdapter<Word> {

    private int colorResId;
    public static final String LOG_TAG = WordAdapter.class.getSimpleName();

    public WordAdapter(Activity context, ArrayList<Word> wordz, int color) {
        super(context, 0, wordz);
        colorResId = color;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Word currentWord = getItem(position);

        View listItem = convertView;
        if (listItem == null)
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        TextView tEnglish = listItem.findViewById(R.id.txtEnglish);
        tEnglish.setText(currentWord.getwEnglish());
        TextView tZulu = listItem.findViewById(R.id.txtZulu);
        tZulu.setText(currentWord.getwZulu());
        ImageView tImage = listItem.findViewById(R.id.myimage);

        if (currentWord.hasImage()) {
            tImage.setImageResource(currentWord.getImageResId());
            tImage.setVisibility(View.VISIBLE);
        } else {
            tImage.setVisibility(View.GONE);
        }

        View layoutContainer = listItem.findViewById(R.id.list_container);
        int color = ContextCompat.getColor(getContext(), colorResId);
        layoutContainer.setBackgroundColor(color);
        return listItem;
        //return super.getView(position, convertView, parent);
    }
}
