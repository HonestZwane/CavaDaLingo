package com.example.ntobekozwane.lingo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("one", "kunye", R.drawable.number_one));
        words.add(new Word("two", "kubili", R.drawable.number_two));
        words.add(new Word("three", "kuthathu", R.drawable.number_three));
        words.add(new Word("four", "kune", R.drawable.number_four));
        words.add(new Word("five", "kuhlanu", R.drawable.number_five));
        words.add(new Word("six", "isthupha", R.drawable.number_six));
        words.add(new Word("seven", "iskhombisa", R.drawable.number_seven));
        words.add(new Word("eight", "isishagalombili", R.drawable.number_eight));
        words.add(new Word("nine", "isishagalolunye", R.drawable.number_nine));
        words.add(new Word("ten", "ishumi", R.drawable.number_ten));

        /*
        words.add("eleven");
        words.add("twelve");
        words.add("thirteen");
        words.add("fourteen");
        words.add("fifteen");
        words.add("sixteen");
        words.add("seventeen");
        words.add("eighteen");
        words.add("nineteen");
        words.add("twenty");
        words.add("twenty one");
        words.add("twenty two");
        words.add("twenty three");
        words.add("twenty four");
        words.add("twenty five");
        words.add("twenty six");
        words.add("twenty seven");
        words.add("twenty eight");
        words.add("twenty nine");
        words.add("thirty");
        words.add("thirty one");
        words.add("thirty two");
        words.add("thirty three");
        words.add("thirty four");
        words.add("thirty fife");
        words.add("thirty six");
        words.add("thirty seven");
        words.add("thirty eight");
        words.add("thirty nine");
        words.add("forty");
        */

        //the 2 lines below were for testing purposes only
        //Log.v("NumbersActivity", "word at index 1 is :" +words.get(0));
        //Log.v("NumbersActivity.class", "word at index 5 is :" +words.get(5));

        WordAdapter wdAdpt = new WordAdapter(this, words, R.color.category_numbers);

        //ArrayAdapter<String> numbAdpt = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, words);
        ListView rootV = findViewById(R.id.rootView);
        rootV.setAdapter(wdAdpt);




/*
        LinearLayout rootV = findViewById(R.id.rootView);
        //Part 1
        int wIndex = 0;
        while (wIndex <words.size())
        {
            TextView wordView = new TextView(this);
            wordView.setText(words.get(wIndex));
            rootV.addView(wordView);
            wordView.setTextSize(20);
            wIndex++;
        }

        //Part 2
        for(int wIndex=0; wIndex<words.size(); wIndex++)
        {
            TextView wordView = new TextView(this);
            wordView.setText(words.get(wIndex));
            rootV.addView(wordView);
            wordView.setTextSize(20);
        }
*/

    }
}
