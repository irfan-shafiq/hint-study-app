package com.irfan.hint_study_app;

import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController 
public class ProblemsController {
    private final AtomicLong counter = new AtomicLong();

    @PostMapping("/problems")
    public Problem handle(@RequestBody ProblemRequest problem) {   
        return new Problem(counter.incrementAndGet(), problem.title(), problem.detail());
    }
    
}
