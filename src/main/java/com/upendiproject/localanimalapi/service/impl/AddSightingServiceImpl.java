package com.upendiproject.localanimalapi.service.impl;

import com.upendiproject.localanimalapi.model.Animal;
import com.upendiproject.localanimalapi.model.Location;
import com.upendiproject.localanimalapi.model.Sighting;
import com.upendiproject.localanimalapi.model.SightingValidator;
import com.upendiproject.localanimalapi.service.AddSightingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
public class AddSightingServiceImpl implements AddSightingService {

    private static final Logger logger = LoggerFactory.getLogger(AddSightingServiceImpl.class);
    private final Predicate<Sighting> isSightingValid = new SightingValidator();

    public void addSighting(Sighting sighting) {

    }

    public void addAnimalToSighting(Long sightingID, Animal animal) {

    }

    public void addAnimalToSighting(Long sightingID, Long animalID) {

    }

    public void addLocationToSighting(Long sightingID, Location location) {

    }

    public void addLocationToSighting(Long sightingID, Long locationID) {

    }

    public boolean isValidSighting(Sighting sighting) {
        return isSightingValid.test(sighting);
    }

}
