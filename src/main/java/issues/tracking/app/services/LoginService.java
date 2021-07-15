package issues.tracking.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import issues.tracking.app.model.UserPrincipal;
import issues.tracking.app.model.Users;
import issues.tracking.app.repository.UserRepository;

@Service
public class LoginService implements UserDetailsService {

    @Autowired UserRepository userRepository;

    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
      Users user = userRepository.findByUsername(username);
      
      if(user == null){
          throw new UsernameNotFoundException("User not found");

      }

      return new UserPrincipal(user);
    }
}
