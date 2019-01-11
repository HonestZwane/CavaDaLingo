package com.example.ntobekozwane.lingo;

import android.media.Image;

public class Word {
    private String wEnglish;
    private String wZulu;
    // private Image wPic;

    public Word(String pEnglish, String pZulu) {
        wEnglish = pEnglish;
        wZulu = pZulu;
    }

    public String getwEnglish() {
        return wEnglish;
    }

    public String getwZulu() {
        return wZulu;
    }


    /*public void setwEnglish(String wEnglish) {
        this.wEnglish = wEnglish;
    }*/
}
