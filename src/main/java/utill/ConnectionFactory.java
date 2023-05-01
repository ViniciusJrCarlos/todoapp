/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utill;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//package com.mysql.jdbc;
/**package com.mysql.jdbc;
 * //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/usuarios", "root", "");
 * @author vinic
 * com.mysql:mysql-connector-j
 */


public class ConnectionFactory {
    
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/todoapp";
    public static final String USER = "root";
    public static final String PASS = "";
    
    
    public static Connection getConnection(){
    //public static Connection getConnection() throws ClassNotFoundException, InstantiationException
        
        try {
        
        
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(URL, USER, PASS);
        
        }catch (Exception ex) {
        
            throw new RuntimeException("Conexao com Banco de dados falhou! ", ex);
        }
    
    }
    
    
    public static void closeConnection(Connection connection){
    
        
        try {
        
        
            if(connection != null) {
                
                connection.close();
            
            
            }
         
        } catch (Exception ex) {
         
            throw new RuntimeException ("Conexao com Banco de dados falhou!", ex);
        }
    
    }
    
    
    public static void closeConnection(Connection connection, PreparedStatement statement){
    
        
        try {
        
        
            if(connection != null) {
                
                connection.close();
            
            
            }
            
            if (statement != null) {
                
                statement.close();
            
            }
            
         
        } catch (Exception ex) {
         
            throw new RuntimeException ("Conexao com Banco de dados falhou!", ex);
        }
    
    }
    
    public static void closeConnection(Connection connection, PreparedStatement statement, ResultSet resultSet){
    
        
        try {
        
        
            if(connection != null) {
                
                connection.close();
            
            
            }
            
            if (statement != null) {
                
                statement.close();
            
            }
            
            if (resultSet != null) {
                
               resultSet.close();
                
            }
            
         
        } catch (Exception ex) {
         
            throw new RuntimeException ("Conexao com Banco de dados falhou!", ex);
        }
    
    }
    
}
