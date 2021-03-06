/* (swing1.1.1beta2) swing#1785 */
//package jp.gr.java_conf.tame.swing.examples;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.basic.*;

/**
 * @version 1.0 06/05/99
 */  
public class ToolTipComboBoxExample extends JFrame {

  String[] items    = {"jw"       ,"ja"       ,"la"    };
  String[] tooltips = {"Javanese ","Japanese ","Latin "};
  
  public ToolTipComboBoxExample() {
    super("ToolTip ComboBox Example");  
                      
    JComboBox combo = new JComboBox(items);
    combo.setRenderer(new MyComboBoxRenderer());
    
    getContentPane().setLayout(new FlowLayout());
    getContentPane().add(combo);
  }
      
  class MyComboBoxRenderer extends BasicComboBoxRenderer {
    public Component getListCellRendererComponent( JList list, 
           Object value, int index, boolean isSelected, boolean cellHasFocus) {
      if (isSelected) {
        setBackground(list.getSelectionBackground());
        setForeground(list.getSelectionForeground());      
        if (-1 < index) {
          list.setToolTipText(tooltips[index]);
        }
      } else {
        setBackground(list.getBackground());
        setForeground(list.getForeground());
      }	
      setFont(list.getFont());
      setText((value == null) ? "" : value.toString());     
      return this;
    }  
  }

  public static void main (String args[]) {
    ToolTipComboBoxExample frame = new ToolTipComboBoxExample();
    frame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
	System.exit(0);
      }
    });
    frame.setSize(200, 140);
    frame.setVisible(true);
  }
}
