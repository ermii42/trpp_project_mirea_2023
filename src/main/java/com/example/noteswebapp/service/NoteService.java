package com.example.noteswebapp.service;

import com.example.noteswebapp.dto.NoteDTO;
import com.example.noteswebapp.model.NoteEntity;

import java.util.UUID;

public interface NoteService {
    NoteEntity getNote(UUID noteUUID);
    NoteEntity saveNote(NoteDTO note);
    void deleteNote(UUID noteUUID);
}
