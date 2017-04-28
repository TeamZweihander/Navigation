package com.zweihander.navigation;


public class Location {
    protected String name;
    protected String locationID;
    protected GPSObject gps;
    
    Location(GPSObject gps, String name, String locationID) {
        this.name = name;
        this.locationID = locationID;
        this.gps = gps;
    }
}
