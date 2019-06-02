package com.example.ntobekozwane.lingo;

import android.media.Image;
import android.media.MediaPlayer;

public class Word {
    private String wEnglish;
    private String wZulu;
    // private Image wPic;
    private int imageResId = NO_IMAGE;
    private static final int NO_IMAGE = -1;

    private int wSoundId;

    public Word(String pEnglish, String pZulu) {
        wEnglish = pEnglish;
        wZulu = pZulu;
    }

    //this constructor takes 3 parameter, english, zulu and sound
    public Word(String pEnglish, String pZulu, int soundResId) {
        wEnglish = pEnglish;
        wZulu = pZulu;
        wSoundId = soundResId;
    }

    //this constructor takes 4 parameter, english, zulu image and sound
    public Word(String pEnglish, String pZulu, int pImageId, int soundResId) {
        wEnglish = pEnglish;
        wZulu = pZulu;
        imageResId = pImageId;
        wSoundId = soundResId;
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

    public int getwSoundId() {
        return wSoundId;
    }
}
