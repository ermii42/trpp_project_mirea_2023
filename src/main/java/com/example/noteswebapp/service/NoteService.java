package com.example.noteswebapp.service;

import com.example.noteswebapp.model.Note;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.UUID;

public interface NoteService {
    Note getNote(UUID noteUUID);
    Note saveNote(Note note);
}
