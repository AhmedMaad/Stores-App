package com.example.stores.data;

public class Storesmodel {
    private int picture;
    private int versionName;


    public Storesmodel(int picture, int versionName) {
        this.picture = picture;
        this.versionName = versionName;

    }


    public int getPicture() {
        return picture;
    }

    public int getVersionName() {
        return versionName;
    }


}
