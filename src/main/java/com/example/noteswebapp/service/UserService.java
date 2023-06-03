package com.example.noteswebapp.service;

import com.example.noteswebapp.model.UserEntity;

import java.util.UUID;

public interface UserService {
    UserEntity getUser(UUID userUUID);
    UserEntity saveUser(UserEntity user);
}
