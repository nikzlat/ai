package ru.kresolpedik.ai.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
public class TargetClassDto extends ClassDto {
    private Integer targetMethodLineNumber;
    private Integer targetMethodColumnNumber;
    private TargetMethodDto targetMethod;

    @Builder
    public TargetClassDto(String packageName, String className, String fileName, List<ImportDto> imports, ClassDto superClass, List<ClassDto> interfaces, Integer targetMethodLineNumber, Integer targetMethodColumnNumber, TargetMethodDto targetMethod) {
        super(packageName, className, fileName, imports, superClass, interfaces);
        this.targetMethodLineNumber = targetMethodLineNumber;
        this.targetMethodColumnNumber = targetMethodColumnNumber;
        this.targetMethod = targetMethod;
    }
}

