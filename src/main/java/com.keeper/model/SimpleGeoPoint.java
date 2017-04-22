package com.keeper.model;

/*
 * Created by @GoodforGod on 16.04.2017.
 */

import com.keeper.util.validation.annotation.GeoCoordinate;

/**
 * Default Comment
 */
public class SimpleGeoPoint {

    private String longtitude;
    private String latitude;

    public SimpleGeoPoint(@GeoCoordinate String longtitude,
                          @GeoCoordinate String latitude) {
        this.longtitude = longtitude;
        this.latitude = latitude;
    }

    public String getLongtitude() {
        return longtitude;
    }

    public String getLatitude() {
        return latitude;
    }
}
