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
}
