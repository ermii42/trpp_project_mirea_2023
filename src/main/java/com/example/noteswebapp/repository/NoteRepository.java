package com.example.noteswebapp.repository;

import com.example.noteswebapp.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface NoteRepository extends JpaRepository<Note, UUID> {
}
