package com.ai.pj.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


    @GetMapping("/")
    public String home(){
        return "index"; // index.mustache 또는 index.html 렌더링
    }

    // /home 요청을 /로 리다이렉트
    @GetMapping("/home")
    public String redirectToHome() {
        return "redirect:/"; // /home 요청을 기본 경로로 리다이렉트
    }

}
