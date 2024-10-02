package ru.kresolpedik.ai.dto;

public record ProjectDto(
    String name,
    String language,
    String languageVersion,
    String buildTool,
    String ideVersion,
    String testingFrameworkName,
    String testingFrameworkVersion
) {}
