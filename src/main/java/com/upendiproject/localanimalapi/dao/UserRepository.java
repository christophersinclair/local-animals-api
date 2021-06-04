package com.upendiproject.localanimalapi.dao;

import com.upendiproject.localanimalapi.model.User;

public interface UserRepository {

    public User findByEmail(String email);

    public void registerUser(User user);
}
