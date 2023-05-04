/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utill;

import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import model.Task;

/**
 *
 * @author vinic
 */
public class DeadlineColumnCellRederer extends DefaultTableCellRenderer {
    
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
    
       JLabel label;
       
       label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    
       label.setHorizontalAlignment(CENTER);
       
       TaskTableModel taskModel = (TaskTableModel) table.getModel();
       Task task = taskModel.getTasks().get(row);
       
       if(task.getDeadline().after(new Date())) {
       
           label.setBackground(Color.green);
       
       } else {
       
           label.setBackground(Color.red);
           
       }
       
       
       return label;
    
    
    }
    
}
