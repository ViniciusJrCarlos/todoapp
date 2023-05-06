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
        
        Connection c  = ConnectionFactory.getConnection();
        ConnectionFactory.closeConnection(c);
        
        ProjectController projectController = new ProjectController();
        Project project = new project();
        //project.setId(1);
        //project.setName("Novo nome teste");
        //project.setDescription("descricao nova");
        //projectController.update(project);
        //project.setName("projeto teeste 2");
        ///project.setDescription("descricao");
       //project.setCreatedAt(new Date());
        
        
      
      
        
        //project.setName("Novo nome do projeto");
        //projectController.update(project);
        
       //List<Project> projects = projectController.getAll();
       //System.out.println("Total de projetos = " + projects.size());
       
       //projectController.removeById(2);
       
       TaskController taskController = new TaskController();
       Task task = new Task();
       
       //task.setIdProject(1);
       //task.setName("Criando telas da aplicação");
       //task.setDescription("telas de cadastro");
       //task.setNotes("sem notas");
       //task.setCompleted(false);
       ///task.setDeadline(new Date());
       //task.setName("alterando tela de cadastro");
       //taskController.update(task);
       
       //taskController.save(task);
       
       //List<Task> tasks = taskController.getAll(1);
       
       //System.out.println("total de tarefas = " + tasks.size());
        
    }
    
    
}
    //private static class project extends Project {

       // public project() {
       // }
    //}
    

