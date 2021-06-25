package com.example.stores.data;

public class ProductsModel {
   private int picture2;
   private int versionName2;


    public ProductsModel(int picture, int versionName ) {
        this.picture2 = picture;
        this.versionName2 = versionName;

    }
    public int getPicture() {

        return picture2;
    }

    public int getVersionName() {
        return versionName2;
    }

    }

