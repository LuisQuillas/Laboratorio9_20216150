package com.example.laboratio9;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String vista1() {
        return "vista1";
    }
}
