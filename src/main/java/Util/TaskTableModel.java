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
public class TaskTableModel extends AbstractTableModel{
    
    String [] columns = {"Nome", "Descrição", "Prazo", "Tarefa Concluída", "Editar", "Excluir"};
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
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 1:
                
             return tasks.get(rowIndex).getNome();
        
            case 2:
                
                break;
    
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                
                break;
            case 6:
                
                break;
    
            default:
        
        }
    }
    
}
