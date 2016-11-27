package org.allen.springsecurity.service.impl;

import org.allen.springsecurity.entity.User;
import org.allen.springsecurity.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private static final Logger logger = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

    @Autowired
    UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        logger.info("####### username=" + username);
        User user = userService.getByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(username + " cannot be found");
        }

        boolean enabled = true;
        boolean accountNonExpired = true;
        boolean credentialsNonExpired = true;
        boolean accountNonLocked = true;

        return new org.springframework.security.core.userdetails.User(
                user.getUsername(),
                user.getPassword(),
                enabled,
                accountNonExpired,
                credentialsNonExpired,
                accountNonLocked,
                getAuthorities(user));
    }

    private List<GrantedAuthority> getAuthorities(User user) {
        // TODO get role by userId
        // TODO get authority by roleId
        List<GrantedAuthority> authList = new ArrayList<GrantedAuthority>();
        // MOCK
        if ("admin".equals(user.getUsername())) {
            authList.add(new SimpleGrantedAuthority("delete_user"));
        }

        return authList;
    }
}
