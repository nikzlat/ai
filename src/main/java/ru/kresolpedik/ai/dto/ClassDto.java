package ru.kresolpedik.ai.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class ClassDto {
    protected String packageName;
    protected String className;
    protected String fileName;
    protected List<ImportDto> imports;
    protected ClassDto superClass;
    protected List<ClassDto> interfaces;
}
