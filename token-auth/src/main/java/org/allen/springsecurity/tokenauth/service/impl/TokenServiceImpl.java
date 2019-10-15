package org.allen.springsecurity.tokenauth.service.impl;

import org.allen.springsecurity.tokenauth.service.TokenService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TokenServiceImpl implements TokenService {

    @Override
    public User checkToken(String token) {
        // TODO check token from third party
        return new User("allen", "", new ArrayList<GrantedAuthority>());
    }
}
