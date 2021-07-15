package issues.tracking.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {
    
    @GetMapping("/about")

    // returns the about page
    public String getHomePage(){
       
        return "about";
    }
    
}
