package com.example.stores.data;

import android.widget.EditText;

public class LocationModel {

    private String email;
    private String governorate;
    private String area;
    private String streetName;
    private String buildingNo;
    private String flat;
    private String specialMark;

    public LocationModel(String email, String governorate, String area, String streetName
            , String buildingNo, String flat, String specialMark) {
        this.email = email;
        this.governorate = governorate;
        this.area = area;
        this.streetName = streetName;
        this.buildingNo = buildingNo;
        this.flat = flat;
        this.specialMark = specialMark;
    }

    public LocationModel(){}

    public String getEmail() {
        return email;
    }

    public String getGovernorate() {
        return governorate;
    }

    public String getArea() {
        return area;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getBuildingNo() {
        return buildingNo;
    }

    public String getFlat() {
        return flat;
    }

    public String getSpecialMark() {
        return specialMark;
    }
}
