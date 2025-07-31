package com.example.thymeleftTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    // http://localhost:8080/main
    @GetMapping({"main","/"})
    public String mainPage(){
        return "mainPage";
    }
}
