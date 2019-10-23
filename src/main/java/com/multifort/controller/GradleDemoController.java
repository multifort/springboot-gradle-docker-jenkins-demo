package com.multifort.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gradle")
public class GradleDemoController {
    @GetMapping("/hello")
    public String get(){
        return "hello test jenkins";
    }
}
