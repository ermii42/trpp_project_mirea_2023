package com.example.noteswebapp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

// test
@Entity
@Data

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;

    private String name;
    private String email;
    private String login;
    private  String password;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Note> notesList;
}
