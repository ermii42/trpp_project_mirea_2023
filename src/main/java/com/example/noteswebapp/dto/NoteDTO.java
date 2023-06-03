package com.example.noteswebapp.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class NoteDTO {
    private String header;
    private String text;
}
