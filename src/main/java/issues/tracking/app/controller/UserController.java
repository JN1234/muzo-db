package issues.tracking.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import issues.tracking.app.model.Users;
import issues.tracking.app.services.UserService;

@Controller
public class UserController {
   
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String getUsersz(){
        return "User";
    }

    //Modified method to Add a new user
    @PostMapping(value="users/addNew")
    public RedirectView addNew(Users user, RedirectAttributes redir){
        userService.save(user);
        RedirectView redirectView= new RedirectView("/login", true);
        redir.addFlashAttribute("message","You successfully registered!");
        return redirectView;
    }
}


