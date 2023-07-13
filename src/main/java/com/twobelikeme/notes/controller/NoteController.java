package com.twobelikeme.notes.controller;

import com.twobelikeme.notes.entity.Note;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/notes", produces = MediaType.APPLICATION_JSON_VALUE)
public class NoteController {

    @GetMapping(path = "/{id}")
    public Note getNote(@PathVariable(name = "id") Long noteId) {
        return null;
    }

}
