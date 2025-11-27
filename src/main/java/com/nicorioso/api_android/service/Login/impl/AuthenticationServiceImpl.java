package com.nicorioso.api_android.service.Login.impl;

import com.nicorioso.api_android.model.entity.User;
import com.nicorioso.api_android.repository.UserRepository;
import com.nicorioso.api_android.service.Login.AuthenticationService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    private final UserRepository userRepository;

    public AuthenticationServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User login(User user) {
        User userEntity = userRepository.findByName(user.getName())
                .orElseThrow(() -> new RuntimeException("No se encontró el usuario"));

        if (!user.getPassword().equals(userEntity.getPassword())) {
            throw new RuntimeException("Contraseña incorrecta");
        }

        return userEntity;
    }


}
