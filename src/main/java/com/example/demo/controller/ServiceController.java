package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/service")
public class ServiceController {

    @RequestMapping(value = "hello", method = RequestMethod.POST)
    public @ResponseBody ResponseEntity<?> hello() {
        return ResponseEntity.ok(null);
    }
}
