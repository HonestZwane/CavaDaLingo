package com.example.ntobekozwane.lingo;

import android.media.Image;

public class Word {
    private String wEnglish;
    private String wZulu;
    // private Image wPic;
    private int imageResId = NO_IMAGE;
    private static final int NO_IMAGE = -1;

    public Word(String pEnglish, String pZulu) {
        wEnglish = pEnglish;
        wZulu = pZulu;
    }

    public Word(String pEnglish, String pZulu, int pImageId) {
        wEnglish = pEnglish;
        wZulu = pZulu;
        imageResId = pImageId;
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

    public int getImageResId() {
        return imageResId;
    }

    //checks whether there is an image the word
    public boolean hasImage() {
        return imageResId != NO_IMAGE;
    }
}
