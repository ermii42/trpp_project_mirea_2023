package com.example.noteswebapp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Data
public class NoteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id_note;

//    private UUID id_user;
    private String header;
    private String text;
//    private String style;
//    private Date reminder;
//    private String absPath;
//
//    private Date changeTime;
//    private String comment;
//    private Integer favorite; // ?????
//
//    @OneToMany(cascade = CascadeType.ALL)
//    private List<FileEntity> fileList;
}
