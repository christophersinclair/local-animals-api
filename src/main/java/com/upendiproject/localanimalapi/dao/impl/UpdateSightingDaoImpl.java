package com.upendiproject.localanimalapi.dao.impl;

import com.upendiproject.localanimalapi.dao.UpdateSightingDao;
import com.upendiproject.localanimalapi.exception.LocalAnimalApiException;
import com.upendiproject.localanimalapi.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

@Repository
public class UpdateSightingDaoImpl implements UpdateSightingDao {

    private static final Logger logger = LoggerFactory.getLogger(AddSightingDaoImpl.class);

    private EntityManager entityManager;

    public UpdateSightingDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void updateSighting(Long sightingID, Long fileID) {
        try {
            Query q = entityManager.createNativeQuery("UPDATE Sighting s SET s.image_id = :fileID WHERE s.id = :sightingID");
            q.setParameter("sightingID", sightingID);
            q.setParameter("fileID", fileID.toString());
            int response = q.executeUpdate();
            if (response != 0) {
                throw new LocalAnimalApiException("Update of sighting " + sightingID + " with file ID of " + fileID + " failed.");
            }
        } catch (Exception ex) {
            logger.error("Update of sighting " + sightingID + " with file ID of " + fileID + " failed.");
        }
    }

}
