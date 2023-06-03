package com.example.noteswebapp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.UUID;

// test
@Entity
@Data

public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id_user;

    private String name;
    private String email;

    private Integer phoneNumber;
    private  String password; // ????

    private Date birthday;
    private String language;

    @OneToMany(cascade = CascadeType.ALL)
    private List<NoteEntity> notesList;
}
