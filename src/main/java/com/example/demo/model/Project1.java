package com.example.demo.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Project1 {

        @GetMapping("/welcome")
        public String message()
        {
            return "Web framework project day 1";
        }
}
