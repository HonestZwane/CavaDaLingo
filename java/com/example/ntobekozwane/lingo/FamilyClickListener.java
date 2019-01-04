package com.example.ntobekozwane.lingo;

import android.view.View;
import android.widget.Toast;

public class FamilyClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Open List Of Family Members", Toast.LENGTH_SHORT).show();
    }
}
