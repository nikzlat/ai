package ru.kresolpedik.ai.dto;

import java.util.Map;

public record ConfigFileDto(
        Map<String, String> fileNameToContent
) {}
