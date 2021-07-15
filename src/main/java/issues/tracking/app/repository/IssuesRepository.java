package issues.tracking.app.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import issues.tracking.app.model.Issues;
import issues.tracking.app.repository.IssuesRepository;

@Repository
public interface IssuesRepository extends JpaRepository< Issues, Integer> {

}
