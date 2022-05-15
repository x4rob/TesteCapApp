/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Computador
 */
public class ConnectionFactory {

    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/testecapapp";
    public static final String USER = "root";
    public static final String PASS = "";

    public static java.sql.Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception ex) {
            throw new RuntimeException("Erro na conexão com o banco de dados", ex);
        }
    }

    /**
     *
     * @param connection
     */
    public static void closeConnection(Connection connection) {

        try {
            if (connection != null) {
                connection.close();
            }
        } catch (Exception ex) {
            throw new RuntimeException("Erro de fechar a conecção com o banco de dados!");
        }

    }

    /**
     *
     * @param connection
     * @param statement
     */
    public static void closeConnection(Connection connection, PreparedStatement statement) {

        try {
            if (connection != null) {
                connection.close();
            }
            if (statement != null) {
                statement.close();
            }
        } catch (Exception ex) {
            throw new RuntimeException("Erro de fechar a conecção com o banco de dados!");
        }

    }
   
    
    public static void closeConnection(Connection connection, PreparedStatement statement, ResultSet resultSet){
       
       try{
           if(connection != null){
               connection.close();
           }
           if(statement != null){
               statement.close();
           }
           if (resultSet != null){
               resultSet.close();
           }
       }catch(Exception ex){
           throw new RuntimeException("Erro de fechar a conecção com o banco de dados!");
       } 
    
}
}
