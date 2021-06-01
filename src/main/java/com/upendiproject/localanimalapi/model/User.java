package com.upendiproject.localanimalapi.model;

import java.util.List;

public class User {

    private List<Sighting> userSightings;
    private Location userLocation;

    public List<Sighting> getUserSightings() {
        return userSightings;
    }

    public void setUserSightings(List<Sighting> userSightings) {
        this.userSightings = userSightings;
    }

    public Location getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(Location userLocation) {
        this.userLocation = userLocation;
    }
}
