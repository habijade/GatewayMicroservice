package com.nnk.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/toto")
public class TotoRestController {
    @GetMapping
    public String getPatients() {
        return "hello world";
    }
}
