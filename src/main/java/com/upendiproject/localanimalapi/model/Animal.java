package com.upendiproject.localanimalapi.model;

import java.io.File;

public class Animal {

    private enum Diet {
        HERBIVORE, CARNIVORE, OMNIVORE
    }

    private enum Activity {
        NOCTURNAL, DIURNAL, CREPUSCULAR, AURORAL
    }

    private enum ScienficClass {
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
    private File frontTracks;
    private File backTracks;
    private File range;
    private File animalImage;
}
