package com.upendiproject.localanimalapi.model;

import java.util.List;
import java.util.Map;

public class Location {
    private String locationDescription;
    private double latitude;
    private double longitude;
    private List<Animal> animalsInLocation;
    private List<Sighting> sightingsInLocation;
    private Map<String, String> usersInLocation;

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public List<Animal> getAnimalsInLocation() {
        return animalsInLocation;
    }

    public void setAnimalsInLocation(List<Animal> animalsInLocation) {
        this.animalsInLocation = animalsInLocation;
    }

    public List<Sighting> getSightingsInLocation() {
        return sightingsInLocation;
    }

    public void setSightingsInLocation(List<Sighting> sightingsInLocation) {
        this.sightingsInLocation = sightingsInLocation;
    }

    public Map<String, String> getUsersInLocation() {
        return usersInLocation;
    }

    public void setUsersInLocation(Map<String, String> usersInLocation) {
        this.usersInLocation = usersInLocation;
    }
}
