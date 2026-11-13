package com.example.laboratio9;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String vista1() {
        return "vista1";
    }
    @GetMapping("/vista2")
    public String vista2() {
        return "vista2";
    }
    @GetMapping("/vista3")
    public String vista3() {
        return "vista3";
    }

    @GetMapping("/vista4")
    public String vista4() {
        return "vista4";
    }

    @GetMapping("/vista5")
    public String vista5() {
        return "vista5";
    }

    @GetMapping("/vista6")
    public String vista6() {
        return "vista6";
    }

    @GetMapping("/vista7")
    public String vista7() {
        return "vista7";
    }
}
