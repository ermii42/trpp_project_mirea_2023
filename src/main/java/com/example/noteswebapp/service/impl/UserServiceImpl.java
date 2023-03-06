package com.example.noteswebapp.service.impl;

import com.example.noteswebapp.model.User;
import com.example.noteswebapp.repository.UserRepository;
import com.example.noteswebapp.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    @SneakyThrows
    public User getUser(UUID userUUID) {
        Optional<User> optionalUser = userRepository.findById(userUUID);
        return optionalUser.orElseThrow(() -> new ChangeSetPersister.NotFoundException());
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
