package br.com.people.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleController {

  @GetMapping("/")
  public String hello(){
    return "CI/CD HEROKU  MANO hh";
  }

  @GetMapping("/hello")
  public String hello1(){
    return "CI/CD";
  }
}
