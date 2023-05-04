/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todoapp;

/**
 *
 * @author vinic
 */

import controller.ProjectController;
import controller.TaskController;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Project;
import model.Task;
import utill.ConnectionFactory;

public class Main {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Connection c  = ConnectionFactory.getConnection();
        //ConnectionFactory.closeConnection(c);
        
        ProjectController projectController = new ProjectController();
        Project project = new project();
        //project.setName("projeto teeste 2");
       //project.setDescription("descricao");
       //project.setCreatedAt(new Date());
        
        
       //projectController.save(project);
        
        //project.setName("Novo nome do projeto");
        //projectController.update(project);
        
       //List<Project> projects = projectController.getAll();
       //System.out.println("Total de projetos = " + projects.size());
        
    }
    
    
}
    //private static class project extends Project {

       // public project() {
       // }
    //}
    

