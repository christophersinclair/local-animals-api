package com.upendiproject.localanimalapi.dao.impl;

import com.upendiproject.localanimalapi.dao.AddSightingDao;
import com.upendiproject.localanimalapi.model.Sighting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
public class AddSightingDaoImpl implements AddSightingDao {

    private static final Logger logger = LoggerFactory.getLogger(AddSightingDaoImpl.class);

    private EntityManager entityManager;

    public AddSightingDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public void addSighting(Sighting sighting) {
        try {
            entityManager.persist(sighting);
        } catch (Exception ex) {
            logger.error("An exception occurred while saving sighting to database: " + ex.getMessage());
        }
    }
}
