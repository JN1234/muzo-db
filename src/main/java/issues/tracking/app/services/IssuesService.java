package issues.tracking.app.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import issues.tracking.app.model.Issues;
import issues.tracking.app.repository.IssuesRepository;

@Service
public class IssuesService {
    
    @Autowired
    private IssuesRepository  issuesRepository;

    // return the list of issues
    public List<Issues> getIssues(){
        return issuesRepository.findAll();
    }
    
      //save the equipment
      public void save(Issues issues){
        issuesRepository.save(issues);
    }
}
