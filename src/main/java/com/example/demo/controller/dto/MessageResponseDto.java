package com.example.demo.controller.dto;

import java.time.LocalDateTime;

import com.example.demo.repository.Message;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class MessageResponseDto {
    private final Integer id;
    private final String message;
    private final LocalDateTime createdAt;

    public static MessageResponseDto from(Message entity) {
        return new MessageResponseDto(
                entity.getId(),
                entity.getMessage(),
                entity.getCreatedAt()
        );
    }
}
