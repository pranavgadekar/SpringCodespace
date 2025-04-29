package com.pranav.spring.codespace.springboot_codespace_demo.controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam(required = false) String name) {
        return String.format("Hello %s", name);
    }

}
