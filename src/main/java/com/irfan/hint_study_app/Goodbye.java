package com.irfan.hint_study_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Goodbye {
    private static final String template = "Goodbye %s!";

    @GetMapping("/goodbye")
    public String goodbye(@RequestParam(defaultValue = "World") String name) {
        return template.formatted(name);
    }
}
