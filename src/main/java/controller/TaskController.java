/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

//import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Task;
import utill.ConnectionFactory;



/**
 *
 * @author vinic
 */
public class TaskController {
    
    public void save (Task task) {
    
        String sql = "INSERT INTO tasks (id_projectsFk"
                + "name," 
                + "description,"
                + "notes,"
                + "isCompleted,"
                + "deadline,"
                + "createdAt,"
                + "updatedAt) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, task.getIdProjectsFk());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.isIsCompleted());
            statement.setString(5, task.getNotes());
            statement.setDate(6, new Date(task.getDeadline().getTime()));
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
            statement.execute();
        
        } catch (Exception ex) {
            
            throw new RuntimeException("Erro ao salvar a tarefa! " + ex.getMessage(), ex);
            
        
        } finally {
            
            ConnectionFactory.closeConnection(connection, statement);
            
          
            
        }
        
    
    }
    
    public void update (Task task) {
        
        String sql = "UPDATE tasks SET id_projectsFk = ?, name = ?, description = ?, notes = ?, isCompleted = ?, deadline = ?, createdAt = ?, updatedAt = ? WHERE id_tasks = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
        
            connection  = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt        (1, task.getIdProjectsFk());
            statement.setString     (2, task.getName());
            statement.setString     (3, task.getDescription());
            statement.setBoolean    (4, task.isIsCompleted());
            statement.setString     (5, task.getNotes());
            statement.setDate       (6, new Date(task.getDeadline().getTime()));
            statement.setDate       (7, new Date(task.getCreatedAt().getTime()));
            statement.setDate       (8, new Date(task.getUpdatedAt().getTime()));
            // caso não insira rever na task.java o get id da task
            statement.setInt        (9, task.getId());
            statement.execute();
            
            
        } catch (Exception ex) {
            
            throw new RuntimeException ("Erro ao atualizar a tarefa..." + ex.getMessage(), ex) ;
        
        }finally {
        
            
            ConnectionFactory.closeConnection(connection, statement);
        
        }
    
    
    }
    
    public void removeById(int taskId) throws SQLException {
        
        String sql = "DELETE FROM tasks WHERE id_tasks = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, taskId);
            statement.execute();
        
        } catch (SQLException ex) {
            
            throw new RuntimeException ("Erro ao deletar a tarefa..." + ex.getMessage(), ex) ;
        
        }finally {
        
            
            ConnectionFactory.closeConnection(connection, statement);
        
        }
    
    }
    
    public List<Task> getAll (int id_projectsFk) {
        
        String sql = "SELECT * FROM tasks WHERE id_projectsFk = ?";
        
        Connection connection = null;
        PreparedStatement statement  = null;
        ResultSet resultSet = null;
        
        List<Task> tasks = new ArrayList<Task>();
        
        try {
        
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, id_projectsFk);
            resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                
                Task task = new Task();
                task.setId(resultSet.getInt("id_tasks"));
                task.setIdProjectsFk(resultSet.getInt("id_projectsFk"));
                task.setName(resultSet.getString("name"));
                task.setDescription(resultSet.getString("description"));
                task.setNotes(resultSet.getString("notes"));
                task.setIsCompleted(resultSet.getBoolean("isCompleted"));
                task.setDeadline(resultSet.getDate("deadline"));
                task.setCreatedAt(resultSet.getDate("createdAt"));
                task.setUpdatedAt(resultSet.getDate("updatedAt"));
                
                tasks.add(task);
            
            }
            
        } catch (Exception ex) {
            
            throw new RuntimeException ("Erro ao selecionar lista..." + ex.getMessage(), ex) ;
        
        }finally {
        
            
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        
        }
       
        return tasks;
    
    
    }
    
    
}
