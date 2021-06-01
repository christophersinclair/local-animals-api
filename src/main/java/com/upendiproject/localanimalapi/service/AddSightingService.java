package com.upendiproject.localanimalapi.service;

import com.upendiproject.localanimalapi.model.Animal;
import com.upendiproject.localanimalapi.model.Location;
import com.upendiproject.localanimalapi.model.Sighting;

import java.util.UUID;

public interface AddSightingService {

    void addSighting(Sighting sighting);

    void addAnimalToSighting(UUID sightingID, Animal animal);

    void addAnimalToSighting(UUID sightingID, UUID animalID);

    void addLocationToSighting(UUID sightingID, Location location);

    void addLocationToSighting(UUID sightingID, UUID locationID);

    boolean isValidSighting(Sighting sighting);

}
