package com.upendiproject.localanimalapi.model;

import java.util.UUID;

public class Animal {

    private UUID animalID;

    private enum Diet {
        HERBIVORE, CARNIVORE, OMNIVORE
    }

    private enum Activity {
        NOCTURNAL, DIURNAL, CREPUSCULAR, AURORAL
    }

    private enum ScientificClass {
        AGNATHA,
        CHRONDRICHYTES,
        OSEICHTHYES,
        AMPHIBIA,
        REPTILIA,
        AVES,
        MAMMALIA
    }

    private enum ConservationStatus {
        NOT_EVALUATED,
        DATA_DEFICIENT,
        LEAST_CONCERN,
        NEAR_THREATENED,
        VULNERABLE,
        ENDANGERED,
        CRITICALLY_ENDANGERED,
        EXTINCT_IN_WILD,
        EXTINCT
    }

    private enum Biome {
        TROPICAL_RAINFOREST,
        TEMPERATE_FOREST,
        DESERT,
        TUNDRA,
        TAIGA,
        GRASSLAND,
        SAVANNA,
        FRESH_WATER,
        MARINE
    }

    private String description;
    private String habitat;
    private String funFact;
    private String frontTracksImageID;
    private String backTracksImageID;
    private String rangeImageID;
    private String animalImageID;

    public UUID getAnimalID() {
        return animalID;
    }

    public void setAnimalID(UUID animalID) {
        this.animalID = animalID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getFunFact() {
        return funFact;
    }

    public void setFunFact(String funFact) {
        this.funFact = funFact;
    }

    public String getFrontTracksImageID() {
        return frontTracksImageID;
    }

    public void setFrontTracksImageID(String frontTracksImageID) {
        this.frontTracksImageID = frontTracksImageID;
    }

    public String getBackTracksImageID() {
        return backTracksImageID;
    }

    public void setBackTracksImageID(String backTracksImageID) {
        this.backTracksImageID = backTracksImageID;
    }

    public String getRangeImageID() {
        return rangeImageID;
    }

    public void setRangeImageID(String rangeImageID) {
        this.rangeImageID = rangeImageID;
    }

    public String getAnimalImageID() {
        return animalImageID;
    }

    public void setAnimalImageID(String animalImageID) {
        this.animalImageID = animalImageID;
    }
}
