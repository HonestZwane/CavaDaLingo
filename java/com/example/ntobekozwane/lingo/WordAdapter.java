package com.example.ntobekozwane.lingo;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class
WordAdapter extends ArrayAdapter<Word> {

    public static final String LOG_TAG = WordAdapter.class.getSimpleName();

    public WordAdapter(Activity context, ArrayList<Word> wordz) {
        super(context, 0, wordz);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Word currentWord = getItem(position);

        View listItem = convertView;
        if (listItem == null)
            listItem = LayoutInflater.from(getContext()).inflate(position, parent);

        TextView tEnglish = listItem.findViewById(R.id.txtEnglish);
        tEnglish.setText(currentWord.getwEnglish());
        TextView tZulu = listItem.findViewById(R.id.txtZulu);
        tZulu.setText(currentWord.getwZulu());

        return listItem;
        //return super.getView(position, convertView, parent);
    }
}
