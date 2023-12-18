package com.example.whoami;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainContoller {
    @GetMapping("/")
    public String index(){
        return "home.html";
    }
}
