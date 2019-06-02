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
        words.add(new Word("father", "baba", R.drawable.family_father, R.raw.future_blood_sweat_tears));
        words.add(new Word("mother", "mama", R.drawable.family_mother, R.raw.future_blood_sweat_tears));
        words.add(new Word("brother", "bhuti", R.drawable.family_younger_brother, R.raw.future_blood_sweat_tears));
        words.add(new Word("sister", "sisi", R.drawable.family_younger_sister, R.raw.future_blood_sweat_tears));
        words.add(new Word("grandmother", "gogo", R.drawable.family_grandmother, R.raw.future_blood_sweat_tears));
        words.add(new Word("grandfather", "mkhulu", R.drawable.family_grandfather, R.raw.future_blood_sweat_tears));
        words.add(new Word("uncle", "malume", R.drawable.family_older_brother, R.raw.future_blood_sweat_tears));
        words.add(new Word("aunt", "anti", R.drawable.family_older_sister, R.raw.future_blood_sweat_tears));
        words.add(new Word("niece/nephew", "mshana", R.drawable.family_daughter, R.raw.future_blood_sweat_tears));
        words.add(new Word("cousin", "mzala", R.drawable.family_father, R.raw.future_blood_sweat_tears));
        words.add(new Word("son", "ndodana", R.drawable.family_son, R.raw.future_blood_sweat_tears));
        words.add(new Word("daughter", "ndodakazi", R.drawable.family_daughter, R.raw.future_blood_sweat_tears));


        WordAdapter wdAdpt = new WordAdapter(this, words, R.color.category_family);
        ListView rootV = findViewById(R.id.rootView);
        rootV.setAdapter(wdAdpt);

    }
}
