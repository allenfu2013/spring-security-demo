package org.allen.springsecurity.server.service.security;

import org.allen.springsecurity.server.model.User;
import org.allen.springsecurity.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class UserAuthConfigService {

    @Autowired
    private UserService userService;

    public User getUser(String email) {
        return userService.findByEmail(email);
    }

    public List<GrantedAuthority> getRights(User user) {
        List<GrantedAuthority> grantedAuthority = new LinkedList<GrantedAuthority>();
        List<String> right = user.getRights();
        if (null != right && !right.isEmpty()) {
            for (String r : right) {
                grantedAuthority.add(new SimpleGrantedAuthority(r));
            }
        }
        return grantedAuthority;
    }

}
