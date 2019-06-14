package com.company.learning.learning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("helloString/{id}")
    public String getString(@PathVariable("id") String id) {
        return "hola " + id;
    }

    @GetMapping("helloJson")
    public HelloResponse getJson() {
        return new HelloResponse("hola");
    }
}
