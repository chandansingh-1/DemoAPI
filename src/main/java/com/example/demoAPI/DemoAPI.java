package com.example.demoAPI;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoAPI {

    @GetMapping("/demo")
    public ResponseEntity<String> getMessage(@RequestParam("msg") String msg) {
        return new ResponseEntity<>(msg, HttpStatus.CREATED);
    }
}
