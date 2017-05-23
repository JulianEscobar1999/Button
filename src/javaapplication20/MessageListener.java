
package javaapplication20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class MessageListener implements ActionListener{
    
    public void actionPerformed(ActionEvent event){
        JOptionPane.showMessageDialog(null, "You clicked the button");
    }
    
}
