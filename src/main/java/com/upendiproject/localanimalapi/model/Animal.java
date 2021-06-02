package com.upendiproject.localanimalapi.model;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "Animal", schema = "upendi")
public class Animal {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long animalID;

    @Enumerated(EnumType.STRING)
    private Diet diet;
    private enum Diet {
        HERBIVORE, CARNIVORE, OMNIVORE
    }

    @Enumerated(EnumType.STRING)
    private Activity activity;
    private enum Activity {
        NOCTURNAL, DIURNAL, CREPUSCULAR, AURORAL
    }

    @Enumerated(EnumType.STRING)
    private ScientificClass scientificClass;
    private enum ScientificClass {
        AGNATHA,
        CHRONDRICHYTES,
        OSEICHTHYES,
        AMPHIBIA,
        REPTILIA,
        AVES,
        MAMMALIA
    }

    @Enumerated(EnumType.STRING)
    private ConservationStatus conservationStatus;
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

    @Enumerated(EnumType.STRING)
    private Biome biome;
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

    @Column(name = "description") @NonNull
    private String description;
    @Column(name = "habitat") @NonNull
    private String habitat;
    @Column(name = "fun_fact")
    private String funFact;
    @Column(name = "front_tracks_image_id")
    private String frontTracksImageID;
    @Column(name = "back_tracks_image_id")
    private String backTracksImageID;
    @Column(name = "range_image_id")
    private String rangeImageID;
    @Column(name = "animal_image_id")
    private String animalImageID;

    public Long getAnimalID() {
        return animalID;
    }

    public void setAnimalID(Long animalID) {
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
