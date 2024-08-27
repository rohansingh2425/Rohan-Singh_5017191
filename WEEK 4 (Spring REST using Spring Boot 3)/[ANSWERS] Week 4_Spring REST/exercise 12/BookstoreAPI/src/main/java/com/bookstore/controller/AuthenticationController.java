package com.bookstore.controller;

import com.bookstore.security.JwtUtil;
import com.bookstore.service.CustomUserDetailsService;
import com.bookstore.model.AuthenticationRequest;
import com.bookstore.model.AuthenticationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authenticate")
public class AuthenticationController {

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private CustomUserDetailsService userDetailsService;

    @PostMapping
    public AuthenticationResponse createToken(@RequestBody AuthenticationRequest request) throws Exception {
        String username = request.getUsername();
        String password = request.getPassword();

        final String token = jwtUtil.generateToken(username);
        return new AuthenticationResponse(token);
    }
}
