package com.upendiproject.localanimalapi.dao;

import com.upendiproject.localanimalapi.model.Sighting;

public interface GetSightingsDao {

    Sighting getSightingFromDB(Long sightingID);

}
