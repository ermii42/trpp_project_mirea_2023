package com.example.noteswebapp.controller;

import com.example.noteswebapp.model.NoteEntity;
import com.example.noteswebapp.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/note")
public class NoteController {
    private final NoteService noteService;

    @PostMapping
    public ResponseEntity<NoteEntity> addNote(@RequestBody NoteEntity note){
        NoteEntity resultNote = noteService.saveNote(note);
        return ResponseEntity.ok(resultNote);
    }

    @GetMapping
    public ResponseEntity<NoteEntity> getNote(@RequestParam("noteUUID") UUID noteUUID){
        NoteEntity note = noteService.getNote(noteUUID);
        return ResponseEntity.ok(note);
    }
}
