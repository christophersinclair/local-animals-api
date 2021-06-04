package com.upendiproject.localanimalapi.service.impl;

import com.upendiproject.localanimalapi.dao.UserRepository;
import com.upendiproject.localanimalapi.exception.UserAlreadyExistsException;
import com.upendiproject.localanimalapi.model.User;
import com.upendiproject.localanimalapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void registerNewUserAccount(User user) throws UserAlreadyExistsException {
        if (emailExists(user.getEmailAddress())) {
            throw new UserAlreadyExistsException("There is already an account associated with this email address: " + user.getEmailAddress());
        }
        userRepository.registerUser(user);
    }

    private boolean emailExists(String email) {
        User user = userRepository.findByEmail(email);
        if (user == null) {
            return false;
        }
        return true;
    }
}
