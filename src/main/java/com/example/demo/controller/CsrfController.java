package com.example.demo.controller;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/csrf")
public class CsrfController {

  @GetMapping("/create")
  public CsrfToken allAccess(CsrfToken token) {
    return token;
  }
}
