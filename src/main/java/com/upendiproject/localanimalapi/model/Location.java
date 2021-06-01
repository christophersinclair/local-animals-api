package com.upendiproject.localanimalapi.model;

import javax.persistence.*;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Entity
@Table(name = "Location")
public class Location {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long locationID;

    @Column(name = "description")
    private String locationDescription;

    @Column(name = "latitude")
    private double latitude;

    @Column(name="longitude")
    private double longitude;

    public Long getLocationID() {
        return locationID;
    }

    public void setLocationID(Long locationID) {
        this.locationID = locationID;
    }

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

}
