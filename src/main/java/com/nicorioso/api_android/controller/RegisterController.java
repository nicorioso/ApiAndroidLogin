package com.nicorioso.api_android.controller;

import com.nicorioso.api_android.model.entity.User;
import com.nicorioso.api_android.service.Login.RegisterService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("register")
public class RegisterController {

    private RegisterService registerService;

    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }

    @PostMapping
    public User register(@RequestBody User user) {
        return registerService.register(user);
    }

}
