package com.upendiproject.localanimalapi.service;

import com.upendiproject.localanimalapi.model.Sighting;
import org.springframework.stereotype.Service;

@Service
public interface RetrieveSightingService {

    Sighting getSightingFromDB(Long sightingID);

}
