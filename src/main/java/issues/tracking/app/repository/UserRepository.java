package issues.tracking.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import issues.tracking.app.model.Users;


@Repository
public interface UserRepository  extends JpaRepository<Users,Integer>{
    Users findByUsername(String username);

}
