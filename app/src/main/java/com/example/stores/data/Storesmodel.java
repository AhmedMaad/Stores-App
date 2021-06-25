package com.example.stores.data;

public class Storesmodel {

    private int picture;
    private int versionName;
    private String key;

    public Storesmodel(int picture, int versionName, String key) {
        this.picture = picture;
        this.versionName = versionName;
        this.key = key;
    }

    public int getPicture() {
        return picture;
    }

    public int getVersionName() {
        return versionName;
    }

    public String getKey() {
        return key;
    }

}
