package issues.tracking.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import issues.tracking.app.model.Issues;
import issues.tracking.app.services.IssuesService;

@Controller
public class IssuesController {
    @Autowired
    private  IssuesService issuesService;
    
    @GetMapping("/issues")

    // returns the home page once 
    //the "localhost:8080/home has been 
    //typed for user view"
    public String getIssues(Model model){
        List<Issues> issuesList= issuesService.getIssues();
        model.addAttribute("issues", issuesList);
        return "issues";
    }

    // save records to and refresh pages issues
    @PostMapping("/issues/addNew")
   public String addNew(Issues issues){
       issuesService.save(issues);
       return "redirect:/issues";
   }
}
