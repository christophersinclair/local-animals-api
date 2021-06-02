package com.upendiproject.localanimalapi.service.impl;

import com.upendiproject.localanimalapi.dao.GetSightingsDao;
import com.upendiproject.localanimalapi.model.Sighting;
import com.upendiproject.localanimalapi.service.RetrieveSightingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RetrieveSightingServiceImpl implements RetrieveSightingService {
    Sighting sighting;

    @Autowired
    private GetSightingsDao getSightingsDao;

    public Sighting getSightingFromDB(Long sightingID) {
        sighting = getSightingsDao.getSightingFromDB(sightingID);
        return sighting;
    }

}
