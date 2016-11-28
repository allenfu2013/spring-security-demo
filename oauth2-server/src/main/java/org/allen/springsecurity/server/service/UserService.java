package org.allen.springsecurity.server.service;

import org.allen.springsecurity.server.model.User;
import org.allen.springsecurity.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public void deleteAll() {
        userRepository.deleteAll();
    }

}
