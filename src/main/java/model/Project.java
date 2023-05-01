/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
//import java.sql.Date;
import java.util.Date;

//arquivo novo
/**
 *
 * @author vinic
 */
public class Project {
    
    private int id_projects;
    private String name;
    private String description;
    private Date createdAt;
    private Date updatedAt;

    public Project(int id_projects, String name, String description, Date createdAt, Date updatedAt) {
        this.id_projects = id_projects;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Project() {
        /// //To change body of generated methods, choose Tools | Templates.
        
        this.createdAt = new Date();
    }
    
     //public Task() {
    
     //this.createdAt = new Date();
     //}

    public int getId() {
        return id_projects;
    }

    public void setId(int id_projects) {
        this.id_projects = id_projects;
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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        //return "Project{" + "id_projects=" + id_projects + ", name=" + name + ", description=" + description + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + '}';
        return this.name;
    }
    
    
    
    
    
}
