/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Project;
import Util.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Computador
 */
public class ProjectController {

    public void save(Project project) {
        String sql = "INSERT TO project(name, description, createdAt, updatedAt) VALUES(?, ?, ?, ?)";
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);

            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));

            statement.execute();

        } catch (Exception ex) {

            throw new RuntimeException("Erro ao salvar projeto! " + ex.getMessage(), ex);
        }finally {
            ConnectionFactory.closeConnection(connection, statement);
        }

    }

    public void update(Project project) {

        String sql = "UPDATE project SET nome = ?, "
                + "description = ?, "
                + "createdAt = ?, "
                + "updatedAt = ?"
                + "WHERE id = ?";
        Connection connection = null;
        PreparedStatement statement = null;

        try {

            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);

            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
            statement.setInt(5, project.getId());

        } catch (Exception ex) {
            throw new RuntimeException("Erro ao atualizar projeto! " + ex.getMessage(), ex);
        }finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }

    public void removeById(int id) {
        String sql = "DELETE FROM project WHERE = ?";
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            statement.execute();
            
        } catch (Exception ex) {
            
            throw new RuntimeException("Erro ao deletar projeto! " + ex.getMessage(), ex);
        }finally {
            ConnectionFactory.closeConnection(connection, statement);
        }

    }

    public List<Project> getAll() {
        String sql = "SELECT FROM project WHERE id = ?";
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        List<Project> projects = new ArrayList<Project>();
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
           
            while (resultSet.next()) {                
                
                Project project = new Project();
                
                project.setId(resultSet.getInt("id"));
                project.setName(resultSet.getString("name"));
                project.setDescription(resultSet.getString("description"));
                project.setCreatedAt(resultSet.getDate("createdAt"));
                project.setUpdatedAt(resultSet.getDate("updatedAt"));
                
                projects.add(project);
                
            }
            
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao inserir projeto! " + ex.getMessage(), ex);
        }finally {
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }

        return projects;
    }

}