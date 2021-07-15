package issues.tracking.app.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;

@Entity
public class Equipment {
    
   // @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer  id;
    private String name;
    private String description;


    
    public Equipment(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }



    public Equipment() {
    }


    public String getDescription() {
        return description;
    }



    public void setDescription(String description) {
        this.description = description;
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
    

    
}
