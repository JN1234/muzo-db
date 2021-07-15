package issues.tracking.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;


@Entity
public class Roles {
   
   //@GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String name;

    
    public Roles(Integer id, String name) {
        this.id = id;
        this.name = name;
    }


    public Roles() {
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
