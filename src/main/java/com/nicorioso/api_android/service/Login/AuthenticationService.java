package com.nicorioso.api_android.service.Login;

import com.nicorioso.api_android.model.entity.User;

public interface AuthenticationService {
    User login(User user);
}
