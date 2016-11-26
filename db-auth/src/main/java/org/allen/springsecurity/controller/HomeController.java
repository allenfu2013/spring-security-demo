package org.allen.springsecurity.controller;

import org.allen.springsecurity.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String home(ModelMap modelMap) {
        modelMap.put("message", "welcome to my page!");
        return "home";
    }
}
