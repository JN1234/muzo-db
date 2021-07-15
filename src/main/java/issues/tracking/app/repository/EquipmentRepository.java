package issues.tracking.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import issues.tracking.app.model.Equipment;

@Repository
public interface EquipmentRepository extends JpaRepository <Equipment,Integer>{
    // repository for equipments
    
}
