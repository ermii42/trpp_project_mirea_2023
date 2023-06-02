package com.example.noteswebapp.service.impl;

import com.example.noteswebapp.dto.NoteDTO;
import com.example.noteswebapp.model.NoteEntity;
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
    public NoteEntity getNote(UUID noteUUID) {
        Optional<NoteEntity> optionalNote = noteRepository.findById(noteUUID);
        return optionalNote.orElseThrow(ChangeSetPersister.NotFoundException::new);
    }

    @Override
    public NoteEntity saveNote(NoteDTO note) {
        NoteEntity noteEntity = new NoteEntity();
        noteEntity.setText(note.getText());
        noteEntity.setHeader(note.getHeader());
        return noteRepository.save(noteEntity);
    }

    @Override
    public void deleteNote(UUID noteUUID) {
        noteRepository.deleteById(noteUUID);
    }
}
