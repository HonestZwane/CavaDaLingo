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
        words.add(new Word("hello", "Sawubona"));
        words.add(new Word("how are you?", "Usaphila?"));
        words.add(new Word("I am fine", "Ngiyaphila"));
        words.add(new Word("thank you", "Ngiyabonga/Siyabonga"));
        words.add(new Word("Good bye", "Usale/Uhambe kahle"));
        words.add(new Word("Please", "Ngiyacela"));
        words.add(new Word("Yes", "Yebo"));
        words.add(new Word("No", "Cha/Hhayi"));
        words.add(new Word("I am hungry", "Ngilambile"));

        WordAdapter wdAdpt = new WordAdapter(this, words, R.color.category_phrases);
        ListView rootV = findViewById(R.id.rootView);
        rootV.setAdapter(wdAdpt);
    }
}
