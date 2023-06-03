package com.example.noteswebapp.controller;

import com.example.noteswebapp.model.UserEntity;
import com.example.noteswebapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserEntity> addUser(@RequestBody UserEntity user){
        UserEntity resultUser = userService.saveUser(user);
        return ResponseEntity.ok(resultUser);
    }

    @GetMapping
    public ResponseEntity<UserEntity> getUser(@RequestParam("userUUID") UUID userUUID){
        UserEntity user = userService.getUser(userUUID);
        return ResponseEntity.ok((user));
    }
}
