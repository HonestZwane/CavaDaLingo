package com.example.ntobekozwane.lingo;

public class Word {
    private String wEnglish;
    private String wZulu;

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


}
