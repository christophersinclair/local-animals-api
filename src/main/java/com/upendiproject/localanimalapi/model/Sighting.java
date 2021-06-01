package com.upendiproject.localanimalapi.model;

import java.io.File;
import java.util.Date;
import java.util.List;

public class Sighting {

    private List<Animal> sightingAnimalList;
    private Location sightingLocation;
    private Date sightingDate;
    private String sightingImageID;

    public List<Animal> getSightingAnimalList() {
        return sightingAnimalList;
    }

    public void setSightingAnimalList(List<Animal> sightingAnimalList) {
        this.sightingAnimalList = sightingAnimalList;
    }

    public Location getSightingLocation() {
        return sightingLocation;
    }

    public void setSightingLocation(Location sightingLocation) {
        this.sightingLocation = sightingLocation;
    }

    public Date getSightingDate() {
        return sightingDate;
    }

    public void setSightingDate(Date sightingDate) {
        this.sightingDate = sightingDate;
    }

    public String getSightingImage() {
        return sightingImageID;
    }

    public void setSightingImage(String sightingImage) {
        this.sightingImageID = sightingImage;
    }
}
