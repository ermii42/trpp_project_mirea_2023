package com.example.noteswebapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class TagsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id_tag;

    private UUID id_note;

    private String title;
}
