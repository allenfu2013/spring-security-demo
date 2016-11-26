package org.allen.springsecurity.service;

import org.allen.springsecurity.entity.User;

public interface UserService {

    User findByNameAndPassword(User user);

    User getByUsername(String username);
}
