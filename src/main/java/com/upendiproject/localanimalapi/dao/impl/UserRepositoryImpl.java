package com.upendiproject.localanimalapi.dao.impl;

import com.upendiproject.localanimalapi.dao.UserRepository;
import com.upendiproject.localanimalapi.exception.LocalAnimalApiException;
import com.upendiproject.localanimalapi.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.transaction.Transactional;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private static final Logger logger = LoggerFactory.getLogger(UserRepositoryImpl.class);

    private EntityManager entityManager;

    public UserRepositoryImpl(EntityManager entityManager) { this.entityManager = entityManager; }

    @Override
    public User findByEmail(String email) throws LocalAnimalApiException {
        User result = null;
        try {
            Query q = entityManager.createQuery("SELECT u FROM User u WHERE u.emailAddress = :email");
            q.setParameter("email", email);
            result = (User) q.getSingleResult();
        } catch (NoResultException ex) {
            logger.error("No user found for : " + email);
        }

        return result;
    }

    @Transactional
    @Override
    public void registerUser(User user) throws LocalAnimalApiException {
        try {
            entityManager.persist(user);
        } catch (Exception ex) {
            logger.error("An exception occurred while saving user details to database: " + ex.getMessage());
            throw new LocalAnimalApiException(ex.getMessage());
        }
    }
}
