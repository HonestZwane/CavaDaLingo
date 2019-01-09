package com.example.ntobekozwane.lingo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("red", "bomvu"));
        words.add(new Word("blue", "kuhlaza sasbhakabhaka"));
        words.add(new Word("yellow", "phuzi"));
        words.add(new Word("green", "kuhlaza satshane"));
        words.add(new Word("black", "mnyama"));
        words.add(new Word("white", "mhlophe"));


        WordAdapter wdAdpt = new WordAdapter(this, words);
        ListView rootV = findViewById(R.id.rootView);
        rootV.setAdapter(wdAdpt);
    }
}
