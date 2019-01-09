package com.example.ntobekozwane.lingo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("father", "baba"));
        words.add(new Word("mother", "mama"));
        words.add(new Word("brother", "bhuti"));
        words.add(new Word("sister", "sisi"));
        words.add(new Word("grandmother", "gogo"));
        words.add(new Word("grandfather", "mkhulu"));
        words.add(new Word("uncle", "malume"));
        words.add(new Word("aunt", "anti"));
        words.add(new Word("niece/nephew", "mshana"));
        words.add(new Word("cousin", "mzala"));

        WordAdapter wdAdpt = new WordAdapter(this, words);
        ListView rootV = findViewById(R.id.rootView);
        rootV.setAdapter(wdAdpt);

    }
}
