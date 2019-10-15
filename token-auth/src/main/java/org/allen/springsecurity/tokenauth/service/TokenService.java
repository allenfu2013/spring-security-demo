package org.allen.springsecurity.tokenauth.service;

import org.springframework.security.core.userdetails.User;

public interface TokenService {

    User checkToken(String token);
}
