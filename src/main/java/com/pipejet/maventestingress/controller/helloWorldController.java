package com.pipejet.maventestingress.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class helloWorldController {
    @GetMapping
    public String proBranch() {
        return "pro branch!";
    }
}
