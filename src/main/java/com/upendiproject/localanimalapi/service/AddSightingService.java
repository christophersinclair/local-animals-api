package com.upendiproject.localanimalapi.service;

import com.upendiproject.localanimalapi.model.Animal;
import com.upendiproject.localanimalapi.model.Location;
import com.upendiproject.localanimalapi.model.Sighting;
import org.springframework.stereotype.Service;

@Service
public interface AddSightingService {

    void addSighting(Sighting sighting);

    void addAnimalToSighting(Long sightingID, Animal animal);

    void addAnimalToSighting(Long sightingID, Long animalID);

    void addLocationToSighting(Long sightingID, Location location);

    void addLocationToSighting(Long sightingID, Long locationID);

    boolean isValidSighting(Sighting sighting);

}
