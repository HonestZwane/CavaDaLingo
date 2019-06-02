package com.example.ntobekozwane.lingo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("hello", "Sawubona", R.raw.phrase_are_you_coming));
        words.add(new Word("how are you?", "Usaphila?", R.raw.phrase_are_you_coming));
        words.add(new Word("I am fine", "Ngiyaphila", R.raw.phrase_are_you_coming));
        words.add(new Word("thank you", "Ngiyabonga/Siyabonga", R.raw.phrase_are_you_coming));
        words.add(new Word("Good bye", "Usale/Uhambe kahle", R.raw.phrase_are_you_coming));
        words.add(new Word("Please", "Ngiyacela", R.raw.phrase_are_you_coming));
        words.add(new Word("Yes", "Yebo", R.raw.phrase_are_you_coming));
        words.add(new Word("No", "Cha/Hhayi", R.raw.phrase_are_you_coming));
        words.add(new Word("I am hungry", "Ngilambile", R.raw.phrase_are_you_coming));

        WordAdapter wdAdpt = new WordAdapter(this, words, R.color.category_phrases);
        ListView rootV = findViewById(R.id.rootView);
        rootV.setAdapter(wdAdpt);
    }
}
