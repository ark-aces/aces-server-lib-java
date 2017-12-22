package com.arkaces.aces_server.ark_auth;

import com.arkaces.aces_server.ark_auth.security.AuthenticatedUser;
import com.arkaces.aces_server.ark_auth.security.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
    
    @GetMapping("authenticatedUser")
    public User getAuthenticatedUser(@AuthenticatedUser User user) {
        return user;
    }
}
