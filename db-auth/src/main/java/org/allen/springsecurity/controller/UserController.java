package org.allen.springsecurity.controller;

import org.allen.springsecurity.entity.User;
import org.allen.springsecurity.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public User login(@RequestParam String username, @RequestParam String password) {
        logger.info(String.format("[/login] username:%s, password:%s", username, password));
        Map<String, Object> cond = new HashMap<String, Object>();
        cond.put("username", username);
        cond.put("password", password);
        User user = userMapper.findByCond(cond);
        return user;
    }
}
