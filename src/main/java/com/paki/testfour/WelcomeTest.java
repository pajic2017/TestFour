package com.paki.testfour;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeTest {

  //show us how to return String class
   @GetMapping("/showWorld")
    public String showData(){
       return "Hello World !!!";

    }
}
