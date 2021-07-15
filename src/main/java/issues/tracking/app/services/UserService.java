package issues.tracking.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import issues.tracking.app.model.Users;
import issues.tracking.app.repository.UserRepository;

@Service
public class UserService {
@Autowired
private UserRepository userRepository;

public void save(Users user){
    userRepository.save(user);
}   
}
