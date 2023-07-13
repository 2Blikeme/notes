package com.twobelikeme.notes.entity;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class User {
    private Long id;
    private String login;
    private String email;
    private String password;
}
