package com.example.noteswebapp.service;

import com.example.noteswebapp.model.NoteEntity;

import java.util.UUID;

public interface NoteService {
    NoteEntity getNote(UUID noteUUID);
    NoteEntity saveNote(NoteEntity note);
}
