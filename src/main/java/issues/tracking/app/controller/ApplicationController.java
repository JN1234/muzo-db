package issues.tracking.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping("/home")
    public String goHome(){

        return "index";
    }
    @GetMapping("/login")
    public String login(){

        return "login";
    }

    @GetMapping("/logout")
    public String logout(){

        return "login";
    }
    
    @GetMapping("/register")
    public String register(){

        return "register";
    }
}
