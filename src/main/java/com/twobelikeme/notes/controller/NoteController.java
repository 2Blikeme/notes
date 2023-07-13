package com.twobelikeme.notes.controller;

import com.twobelikeme.notes.entity.Note;
import com.twobelikeme.notes.model.NoteModel;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/notes", produces = MediaType.APPLICATION_JSON_VALUE)
public class NoteController {

    @GetMapping(path = "/{id}")
    public Note getNote(@PathVariable(name = "id") Long noteId) {
        return null;
    }

    @PostMapping(path = "/")
    public Note createNote(@RequestBody NoteModel noteModel) {
        return null;
    }

    @PostMapping(path = "/{id}")
    public Note updateNote(@PathVariable(name = "id") Long noteId,
                           @RequestBody NoteModel noteModel) {
        return null;
    }

    @DeleteMapping(path = "/{id}")
    public Note deleteNote(@PathVariable(name = "id") Long noteId) {
        return null;
    }

}
