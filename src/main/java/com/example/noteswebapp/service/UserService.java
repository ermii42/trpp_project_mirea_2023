package com.example.noteswebapp.service;

import com.example.noteswebapp.model.User;

import java.util.UUID;

public interface UserService {
    User getUser(UUID userUUID);
    User saveUser(User user);
}
