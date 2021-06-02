package com.upendiproject.localanimalapi.dao.impl;

import com.upendiproject.localanimalapi.dao.GetSightingsDao;
import com.upendiproject.localanimalapi.exception.LocalAnimalApiException;
import com.upendiproject.localanimalapi.model.Sighting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
public class GetSightingsDaoImpl implements GetSightingsDao {
    private static final Logger logger = LoggerFactory.getLogger(GetSightingsDaoImpl.class);

    private EntityManager entityManager;

    public GetSightingsDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public Sighting getSightingFromDB(Long sightingID) {
        try {
            return entityManager.find(Sighting.class, sightingID);
        } catch (Exception ex) {
            logger.error("An exception occurred while retrieving a specific sighting from the database: " + ex.getMessage());
            throw new LocalAnimalApiException(ex.getMessage());
        }
    }
}
