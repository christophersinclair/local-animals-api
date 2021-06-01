package com.upendiproject.localanimalapi.service.impl;

import com.upendiproject.localanimalapi.model.Animal;
import com.upendiproject.localanimalapi.model.Location;
import com.upendiproject.localanimalapi.model.Sighting;
import com.upendiproject.localanimalapi.model.SightingValidator;
import com.upendiproject.localanimalapi.service.AddSightingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;
import java.util.function.Predicate;

public class AddSightingServiceImpl implements AddSightingService {

    private static final Logger logger = LoggerFactory.getLogger(AddSightingServiceImpl.class);
    private final Predicate<Sighting> isSightingValid = new SightingValidator();

    public void addSighting(Sighting sighting) {

    }

    public void addAnimalToSighting(UUID sightingID, Animal animal) {

    }

    public void addAnimalToSighting(UUID sightingID, UUID animalID) {

    }

    public void addLocationToSighting(UUID sightingID, Location location) {

    }

    public void addLocationToSighting(UUID sightingID, UUID locationID) {

    }

    public boolean isValidSighting(Sighting sighting) {
        return isSightingValid.test(sighting);
    }

}
