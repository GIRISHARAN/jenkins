package com.learn.jenkins_pipeline;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/students")
public class StudentController {
    @GetMapping(value = "/welcome")
    public ResponseEntity<String> welcomeMsg() {
        return ResponseEntity.status(200).body("Welcome to Student Controller Class");
    }
}
