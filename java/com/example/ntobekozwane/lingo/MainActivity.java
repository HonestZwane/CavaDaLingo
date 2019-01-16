package com.example.ntobekozwane.lingo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //one way to check if the NumberClickListener "works"
        //NumberClickListener numberClickListener = new NumberClickListener();
        //TextView numbTxt = findViewById(R.id.txtNumbers);
        //numbTxt.setOnClickListener(numberClickListener);

        TextView numbTxt = findViewById(R.id.txtNumbers);
        numbTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(i);
            }
        });


    }

    public void NumbersAct(View view)
    {
        Intent i = new Intent(this, NumbersActivity.class);
        startActivity(i);
    }
    public void PhrasesAct(View view)
    {
        Intent i = new Intent(this, PhrasesActivity.class);
        startActivity(i);
    }
    public void FamilyAct(View view)
    {
        Intent i = new Intent(this, FamilyActivity.class);
        startActivity(i);

    }
    public void ColorsAct(View view)
    {
        Intent i = new Intent(this, ColorsActivity.class);
        startActivity(i);
    }
}
