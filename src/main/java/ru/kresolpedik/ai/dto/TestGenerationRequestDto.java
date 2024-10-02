package ru.kresolpedik.ai.dto;

record TestGenerationRequestDto(
    ProjectDto project,
    CodeStyleDto codeStyle,
    VcsInfoDto vcsInfo,
    SourceCodeDto sourceCode,
    TestCodeDto testCode
) {}
