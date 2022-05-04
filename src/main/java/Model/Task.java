/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author Computador
 */
public class Task {
     private int id;
    private int idProject;
    private String nome;
    private String description;
    private boolean completed;
    private String notes;
    private Date deadLine;
    private Date createdAt;
    private Date updatedAt;

    public Task(int id, int idProject, String nome, String description, boolean completed, String notes, Date deadLine, Date createdAt, Date updatedAt) {
        this.id = id;
        this.idProject = idProject;
        this.nome = nome;
        this.description = description;
        this.completed = completed;
        this.notes = notes;
        this.deadLine = deadLine;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    public Task(){
        this.createdAt = new Date();
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
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
        return "Tasks{" + "id=" + id + ", idProject=" + idProject + ", nome=" + nome + ", description=" + description + ", completed=" + completed + ", notes=" + notes + ", deadLine=" + deadLine + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + '}';
    }
}
