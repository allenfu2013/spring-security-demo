package org.allen.springsecurity.service.impl;

import org.allen.springsecurity.entity.User;
import org.allen.springsecurity.mapper.UserMapper;
import org.allen.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User findByNameAndPassword(User user) {
        return userMapper.findByNameAndPassword(user);
    }

    @Override
    public User getByUsername(String username) {
        return userMapper.getByUsername(username);
    }

    @Override
    public void deleteUser(long id) {
        // TODO
        System.out.println("##### delete user, id=" + id);
    }
}
