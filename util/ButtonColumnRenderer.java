package util;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * @author tiago
 */
public class ButtonColumnRenderer extends DefaultTableCellRenderer {
    
    private String buttonType;
    
    public ButtonColumnRenderer(String buttonType){
        this.buttonType = buttonType;
    }
    
    public String getButtonType() {
        return buttonType;
    }
    
    public void setButtonType(){
        this.buttonType = buttonType;
    }
    
    @Override
     public Component getTableCellRendererComponent(JTable table, Object value,
                          boolean isSelected, boolean hasFocus, int row, int column) {
         
         JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
         label.setHorizontalAlignment(JLabel.CENTER);
         label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/" + buttonType + ".png")));
         return this;
     }
}
