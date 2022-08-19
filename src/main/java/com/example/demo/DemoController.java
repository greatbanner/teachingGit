package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam String name) {
        System.out.println("Saludando a " + name);
        System.out.println("Despiendo a " + name);
        return "hello " + name;
    }
}
