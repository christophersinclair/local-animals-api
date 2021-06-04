package com.upendiproject.localanimalapi.dao.impl;

import com.upendiproject.localanimalapi.dao.IDGeneratorDao;
import com.upendiproject.localanimalapi.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.transaction.Transactional;

@Repository
public class IDGeneratorDaoImpl implements IDGeneratorDao {

    private static final Logger logger = LoggerFactory.getLogger(IDGeneratorDaoImpl.class);

    private EntityManager entityManager;

    public IDGeneratorDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public boolean idExists(Long id) {
        String query;
        try {
            Object result = null;
            Query q = null;

            query = "SELECT x FROM User x WHERE x.id = :id";
            q = entityManager.createQuery(query);
            q.setParameter("id", id);
            result = q.getSingleResult();

            query = "SELECT x FROM Sighting x WHERE x.id = :id";
            q = entityManager.createQuery(query);
            q.setParameter("id", id);
            result = q.getSingleResult();

            query = "SELECT x FROM Animal x WHERE x.id = :id";
            q = entityManager.createQuery(query);
            q.setParameter("id", id);
            result = q.getSingleResult();

            query = "SELECT x FROM Location x WHERE x.id = :id";
            q = entityManager.createQuery(query);
            q.setParameter("id", id);
            result = q.getSingleResult();

            return true;
        } catch (NoResultException ex) {
            logger.error("ID " + id + " doesn't exist in the database.");
            return false;
        }
    }
}
