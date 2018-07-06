package com.example.hpenvy15.shapeup;

/**
 * Created by Brenda.
 */

public class locationretro {
    private int Id;
    private float latitude;
    private float longitude;
    private String location_name;

    public locationretro(int id, String location_name, float longitude, float latitude) {
        this.Id = id;
        this.location_name = location_name;
        this.latitude = longitude;
        this.latitude = latitude;

    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return location_name;

    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }
}

