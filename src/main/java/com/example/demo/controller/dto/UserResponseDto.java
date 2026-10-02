package com.example.demo.controller.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.repository.User;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class UserResponseDto {
    private final Integer id;
    private final String name;
    private final Integer age;
    private final String job;
    private final String specialty;
    private final LocalDateTime createdAt;
    private final List<MessageResponseDto> messages;

    public static UserResponseDto from(User user) {
        return new UserResponseDto(
            user.getId(),
                user.getName(),
                user.getAge(),
                user.getJob(),
                user.getSpecialty(),
                user.getCreatedAt(),
                user.getMessages().stream()
                        .map(MessageResponseDto::from)
                        .toList()
        );
    }
}
