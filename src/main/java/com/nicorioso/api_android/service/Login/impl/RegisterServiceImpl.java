package com.nicorioso.api_android.service.Login.impl;

import com.nicorioso.api_android.model.entity.User;
import com.nicorioso.api_android.repository.UserRepository;
import com.nicorioso.api_android.service.Login.RegisterService;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {

    private final UserRepository userRepository;

    public RegisterServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User register(User user) {
        return userRepository.save(user);
    }
}
