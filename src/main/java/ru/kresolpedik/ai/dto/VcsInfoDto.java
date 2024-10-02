package ru.kresolpedik.ai.dto;

public record VcsInfoDto(
        String remoteUrl,
        String currentBranchName
) {}
