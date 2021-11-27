package com.paki.testfour;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeTest {

   @GetMapping("/showWorld")
    public String showData(){
       return "Hello World !!!";

    }
}
