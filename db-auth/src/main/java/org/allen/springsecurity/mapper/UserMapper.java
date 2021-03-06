package org.allen.springsecurity.mapper;

import org.allen.springsecurity.entity.User;

import java.util.Map;

public interface UserMapper {

    User findByNameAndPassword(User user);

    User getByUsername(String username);
}
