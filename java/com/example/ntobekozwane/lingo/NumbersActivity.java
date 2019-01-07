package com.example.ntobekozwane.lingo;

import android.provider.UserDictionary;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //UserDictionary.Words words = new UserDictionary.Words();

        ArrayList<String> words = new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

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

        //the 2 lines below were for testing purposes only
        //Log.v("NumbersActivity", "word at index 1 is :" +words.get(0));
        //Log.v("NumbersActivity.class", "word at index 5 is :" +words.get(5));

        ArrayAdapter<String> numbAdpt = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, words);
        GridView rootV = findViewById(R.id.rootView);
        rootV.setAdapter(numbAdpt);




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
