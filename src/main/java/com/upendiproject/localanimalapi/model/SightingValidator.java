package com.upendiproject.localanimalapi.model;

import java.util.function.Predicate;

public class SightingValidator implements Predicate<Sighting> {

    @Override
    public boolean test(Sighting sighting) {
        if (sighting.getSightingLocationID() == null || sighting.getSightingAnimalID() == null) {
            return false;
        }
        return true;
    }
}
