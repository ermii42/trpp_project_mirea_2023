package com.example.noteswebapp.controller;

import com.example.noteswebapp.model.Note;
import com.example.noteswebapp.service.NoteService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/note")
public class NoteController {
    private final NoteService noteService;

    @PostMapping
    public ResponseEntity<Note> addNote(@RequestBody Note note){
        Note resultNote = noteService.saveNote(note);
        return ResponseEntity.ok(resultNote);
    }

    @GetMapping
    public ResponseEntity<Note> getNote(@RequestParam("noteUUID") UUID noteUUID){
        Note note = noteService.getNote(noteUUID);
        return ResponseEntity.ok(note);
    }
}
