package com.twobelikeme.notes.entity;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.Instant;

@Data
@Builder
@RequiredArgsConstructor
public class Note {
    private Long userId;
    private Instant creationTime;
    private Instant expirationTime;
    private String content;
}
