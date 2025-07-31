package com.example.thymeleftTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
//localhost:8080/user
public class UserController {
    @GetMapping("login")
    // localhost:8080/user/login
    // localhost:8080/user/info
    // userinfo.html 사용자 정보 페이지
    // https://localhost:8080/user/login/success
    public String userLogin() {
        return "/user/userLogin";

    }
    @GetMapping("login/success")
    public String userLoginSuccess(){
        return  "/user/login/Success";
    }

    @GetMapping("info")
    public String userInfo(){
        return "/user/userInfo";
    }

    @GetMapping("saveInfo")
    public String userSaveInfo(){
        System.out.println("사용자 정보를 저장했어요.");
        return "redirect:/main";
//        return "mainPage";
    }



}

