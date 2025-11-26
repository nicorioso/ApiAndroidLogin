package com.nicorioso.api_android.repository;

import com.nicorioso.api_android.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {}
