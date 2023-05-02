package com.chelu.auth;

import org.springframework.security.core.GrantedAuthority;

public class Auth implements GrantedAuthority {
    private String name;

    Auth(String name)
    {
        name = name;
    }
    @Override
    public String getAuthority() {
        return name;
    }
}
