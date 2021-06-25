package com.example.stores.data;

import android.os.Parcel;
import android.os.Parcelable;

public class Storesmodel implements Parcelable {

    private int picture;
    private int versionName;
    private String mealComponents;
    private double price;

    public Storesmodel(int picture, int versionName, String mealComponents, double price) {
        this.picture = picture;
        this.versionName = versionName;
        this.mealComponents = mealComponents;
        this.price = price;
    }

    protected Storesmodel(Parcel in) {
        picture = in.readInt();
        versionName = in.readInt();
        mealComponents = in.readString();
        price = in.readDouble();
    }

    public static final Creator<Storesmodel> CREATOR = new Creator<Storesmodel>() {
        @Override
        public Storesmodel createFromParcel(Parcel in) {
            return new Storesmodel(in);
        }

        @Override
        public Storesmodel[] newArray(int size) {
            return new Storesmodel[size];
        }
    };

    public int getPicture() {
        return picture;
    }

    public int getVersionName() {
        return versionName;
    }

    public double getPrice() {
        return price;
    }

    public String getMealComponents() {
        return mealComponents;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(picture);
        dest.writeInt(versionName);
        dest.writeString(mealComponents);
        dest.writeDouble(price);
    }
}
