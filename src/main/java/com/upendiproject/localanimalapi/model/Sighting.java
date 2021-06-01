package com.upendiproject.localanimalapi.model;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Sighting {

    private UUID sightingID;
    private List<Animal> sightingAnimalList;
    private Location sightingLocation;
    private Date sightingDate;
    private String sightingImageID;

    public UUID getSightingID() {
        return sightingID;
    }

    public void setSightingID(UUID sightingID) {
        this.sightingID = sightingID;
    }


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

    public String getSightingImageID() {
        return sightingImageID;
    }

    public void setSightingImageID(String sightingImageID) {
        this.sightingImageID = sightingImageID;
    }
}
