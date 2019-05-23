package com.example.retrofitdemo;

import com.google.gson.annotations.SerializedName;

public class CityModel {
    @SerializedName("cityname")
    String name;

    public CityModel(String name) {
        this.name = name;
    }
///
    public String getName() {
        return name;
    }
}
