/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utill;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author vinic
 */
public class ButtonColumnCellRederer extends DefaultTableCellRenderer{
    
    private String buttonType;
    
    public ButtonColumnCellRederer(String buttonType) {
        
        this.buttonType = buttonType;
    
    }

    public String getButtonType() {
        return buttonType;
    }

    public void setButtonType(String buttonType) {
        this.buttonType = buttonType;
    }
    
    @Override
     public Component getTableCellRendererComponent(JTable table, Object value,
                          boolean isSelected, boolean hasFocus, int row, int column) {
     
     
     JLabel label;
     label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
     
     label.setHorizontalAlignment(JLabel.CENTER);
     label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/" + buttonType + ".png")));
    
     return label;
     }
    
    
}
