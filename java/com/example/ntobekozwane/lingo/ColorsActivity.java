package com.example.ntobekozwane.lingo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("red", "bomvu", R.drawable.color_red, R.raw.future_blood_sweat_tears));
        words.add(new Word("blue", "kuhlaza sasbhakabhaka", R.drawable.color_blue, R.raw.future_blood_sweat_tears));
        words.add(new Word("yellow", "phuzi", R.drawable.color_dusty_yellow, R.raw.future_blood_sweat_tears));
        words.add(new Word("green", "kuhlaza satshane", R.drawable.color_green, R.raw.future_blood_sweat_tears));
        words.add(new Word("black", "mnyama", R.drawable.color_black, R.raw.future_blood_sweat_tears));
        words.add(new Word("white", "mhlophe", R.drawable.color_white, R.raw.future_blood_sweat_tears));


        WordAdapter wdAdpt = new WordAdapter(this, words, R.color.category_colors);
        ListView rootV = findViewById(R.id.rootView);
        rootV.setAdapter(wdAdpt);
    }
}
