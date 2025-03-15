package com.atharva.blog.services;

import com.atharva.blog.domain.entities.User;

import java.util.UUID;

public interface UserService {

    User getUserById(UUID id);
}
