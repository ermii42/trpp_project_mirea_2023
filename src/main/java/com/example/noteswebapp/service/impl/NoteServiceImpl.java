package com.example.noteswebapp.service.impl;

import com.example.noteswebapp.model.Note;
import com.example.noteswebapp.repository.NoteRepository;
import com.example.noteswebapp.service.NoteService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class NoteServiceImpl implements NoteService {
    private final NoteRepository noteRepository;

    @Override
    @SneakyThrows
    public Note getNote(UUID noteUUID) {
        Optional<Note> optionalNote = noteRepository.findById(noteUUID);
        return optionalNote.orElseThrow(() -> new ChangeSetPersister.NotFoundException());
    }

    @Override
    public Note saveNote(Note note) {
        return noteRepository.save(note);
    }
}
