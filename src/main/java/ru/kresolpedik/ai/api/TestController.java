package ru.kresolpedik.ai.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/public/api/v1/tests")
public class TestController {

    @PostMapping("/generate")
    public Object generateTest(@RequestBody Object balvanka) {
        return null;
    }
}

