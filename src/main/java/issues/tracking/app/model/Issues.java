package issues.tracking.app.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
//import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
public class Issues {
    
   
    //@GeneratedValue(strategy= GenerationType.AUTO)
    private Integer  id;

    private String name;
    
    private String description;
    
    private Date date;


    //@JoinColumn(name="equipmentId", insertable=false, updatable=false)
   // private Equipment equipment;
    private Integer equipmentId;

    private String location;

   

    public Issues(Integer id, String name, String description, Date date, Integer equipmentId, String location) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.date = date;
        this.equipmentId = equipmentId;
        this.location = location;
    }


    public Date getDate() {
        return date;
    }


    public void setDate(Date date) {
        this.date = date;
    }


    public Issues() {
    }


    // Getters and Setters
    @Id
    @GeneratedValue 
       public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public Integer getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    

}
