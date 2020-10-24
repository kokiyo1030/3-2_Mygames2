package com.example.mygames2;

import android.graphics.drawable.Drawable;

public class Game {
    private Drawable mImg;
    private int mName;
    private int mDes;
    private int mToast;

    Game(Drawable img, int name, int des, int toast) {
        mImg = img;
        mName = name;
        mDes = des;
        mToast = toast;
    }
    public Drawable getGameImg() {
        return mImg;
    }
    public int getGameName() {
        return mName;
    }
    public int getGameDesc() {
        return mDes;
    }
    public int getmToast() {
        return mToast;
    }
}
