package org.allen.springsecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("admin")
public class AdminController {

    @RequestMapping(value = "deleteUser", method = RequestMethod.GET)
    @PreAuthorize("authenticated and hasAuthority('delete_user')")
    public String deleteUser(@RequestParam long id) {
        return "admin";
    }
}
