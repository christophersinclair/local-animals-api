package com.upendiproject.localanimalapi.model;

import javax.persistence.*;
import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Sighting")
public class Sighting {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long sightingID;

    @Column(name = "animal_id")
    private Long sightingAnimalID;

    @Column(name = "location_id")
    private Long sightingLocationID;

    @Column(name = "sighting_date")
    private Date sightingDate;

    @Column(name = "image_id")
    private String sightingImageID;

    @Column(name = "user_id")
    private Long userID;

    public Long getSightingID() {
        return sightingID;
    }

    public void setSightingID(Long sightingID) {
        this.sightingID = sightingID;
    }

    public Long getSightingAnimalID() {
        return sightingAnimalID;
    }

    public void setSightingAnimalID(Long sightingAnimalID) {
        this.sightingAnimalID = sightingAnimalID;
    }

    public Long getSightingLocationID() {
        return sightingLocationID;
    }

    public void setSightingLocationID(Long sightingLocationID) {
        this.sightingLocationID = sightingLocationID;
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

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }
}
