package com.example.noteswebapp.controller;

import com.example.noteswebapp.model.User;
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
    public ResponseEntity<User> addUser(@RequestBody User user){
        User resultUser = userService.saveUser(user);
        return ResponseEntity.ok(resultUser);
    }

    @GetMapping
    public ResponseEntity<User> getUser(@RequestParam("userUUID") UUID userUUID){
        User user = userService.getUser(userUUID);
        return ResponseEntity.ok((user));
    }
}
