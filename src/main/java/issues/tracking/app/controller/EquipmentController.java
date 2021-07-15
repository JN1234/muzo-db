package issues.tracking.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import issues.tracking.app.model.Equipment;
import issues.tracking.app.services.EquipmentService;


@Controller
public class EquipmentController {
    
    @Autowired
    private EquipmentService equipmentService;

    @GetMapping("/equipment")

    // returns the home page once 
    //the "localhost:8080/home has been 
    //typed for user view"
    public String getEquipmentPage(Model model){
        List<Equipment> equipmentList= equipmentService.getEquipment();

        model.addAttribute("equipments", equipmentList);

        return "equipment";
    }

    @PostMapping("/equipments/addNew")
   public String addNew(Equipment equipment){
       equipmentService.save(equipment);
       return "redirect:/equipment";
   }

   @RequestMapping("equipments/findById")
   @ResponseBody
   public Optional<Equipment> findById(int id){
      return equipmentService.findById(id);
       
   }

   @RequestMapping(value="/equipments/update",method={RequestMethod.PUT, RequestMethod.GET}) 
  public String update(Equipment equipment){
      equipmentService.save(equipment);
      return "redirect:/equipment";
  }

  @RequestMapping(value="/equipments/delete",method={RequestMethod.DELETE, RequestMethod.GET}) 
  public String delete(Integer id){
      equipmentService.delete(id);
      return "redirect:/equipment";
  }
}
