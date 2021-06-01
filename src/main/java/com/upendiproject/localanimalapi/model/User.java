package com.upendiproject.localanimalapi.model;

import java.util.List;
import java.util.UUID;

public class User {

    private UUID userID;
    private List<Sighting> userSightings;
    private Location userLocation;

    public UUID getUserID() {
        return userID;
    }

    public void setUserID(UUID userID) {
        this.userID = userID;
    }

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
