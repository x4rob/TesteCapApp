/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import Model.Task;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Computador
 */
public class TaskTableModel extends AbstractTableModel {

    String[] columns = {"Nome", "Descrição", "Prazo", "Tarefa Concluída", "Editar", "Excluir"};
    List<Task> tasks = new ArrayList();

    @Override
    public int getRowCount() {
        return tasks.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }
    @Override
    public String getColumnName(int columnIndex){
    
        return columns[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:

                return tasks.get(rowIndex).getNome();

            case 1:

                return tasks.get(rowIndex).getDescription();

            case 2:
                
                return tasks.get(rowIndex).getDeadLine();
            case 3:
                
                return tasks.get(rowIndex).isCompleted();
            case 4:

               return "";
            case 5:

                return "";

            default:
                return "Dado não encontrado!";

        }
    }

    public String[] getColumns() {
        return columns;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

}
