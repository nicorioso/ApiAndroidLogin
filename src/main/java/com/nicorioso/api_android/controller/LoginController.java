package com.nicorioso.api_android.controller;

import com.nicorioso.api_android.model.entity.User;
import com.nicorioso.api_android.service.Login.AuthenticationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    private final AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping
    public User login(@RequestBody User user) {
        return authenticationService.login(user);
    }

}
