package com.example.thymeleftTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
public class AdminController {
    @GetMapping("info")
    private String adminInfo() {
    return "admin/adminInfo";
    }

    @GetMapping("report")
    private String adminReport(){
        return "admin/adminReport";
    }

}
