package org.allen.springsecurity.service;

import org.allen.springsecurity.entity.User;
import org.springframework.security.access.prepost.PreAuthorize;

public interface UserService {

    User findByNameAndPassword(User user);

    User getByUsername(String username);

    void deleteUser(long id);
}
