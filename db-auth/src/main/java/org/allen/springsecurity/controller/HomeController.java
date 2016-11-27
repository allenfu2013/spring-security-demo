package org.allen.springsecurity.controller;

import org.allen.springsecurity.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String home(ModelMap modelMap) {

        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username = userDetails.getUsername();

        logger.info("@@@@@@@ [/home] username=" + username);

        modelMap.put("message", "welcome to my page!");





        return "home";
    }
}
