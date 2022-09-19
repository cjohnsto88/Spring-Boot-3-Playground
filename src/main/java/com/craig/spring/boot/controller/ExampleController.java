package com.craig.spring.boot.controller;

import io.micrometer.observation.annotation.Observed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping
    @Observed
    public String handleGet() {
        return "Hello";
    }
}
