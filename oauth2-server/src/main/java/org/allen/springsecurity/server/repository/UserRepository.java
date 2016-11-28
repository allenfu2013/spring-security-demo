package org.allen.springsecurity.server.repository;

import org.allen.springsecurity.server.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public User save(User user) {
        // TODO
        return user;
    }

    public void deleteAll() {
        // TODO
    }

    public User findByEmail(String email) {
        // TODO
        return null;
    }

    public User findById(Long id) {
        // TODO
        return null;
    }
}
