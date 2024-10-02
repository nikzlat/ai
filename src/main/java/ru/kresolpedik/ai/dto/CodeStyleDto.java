package ru.kresolpedik.ai.dto;

public record CodeStyleDto(
        Integer indentSize,
        Integer continuationIndentSize,
        Boolean useTabCharacter
) {}
