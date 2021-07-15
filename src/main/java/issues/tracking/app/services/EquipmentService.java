package issues.tracking.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import issues.tracking.app.model.Equipment;
import issues.tracking.app.repository.EquipmentRepository;


@Service
public class EquipmentService {
    
    @Autowired
    private EquipmentRepository equipmentRepository;

    //return list  equipments
    public List<Equipment> getEquipment(){
    return equipmentRepository.findAll();
    }

     //save the equipment
     public void save(Equipment equipment){
        equipmentRepository.save(equipment);
    }

    //get by id
    //optional incase it does not work it should not crash
    public Optional<Equipment> findById(int id){
        return equipmentRepository.findById(id);
    }

    public void delete(Integer id){
        equipmentRepository.deleteById(id);
    }
}
