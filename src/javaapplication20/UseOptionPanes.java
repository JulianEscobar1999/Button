
package javaapplication20;

import javax.swing.*;

public class UseOptionPanes {

    
    public static void main(String[] args) {
    
        String name = JOptionPane.showInputDialog(null,"What is you name? ");
        
        int choice = JOptionPane.showConfirmDialog(null, "Do you like cake "+name+" ?");
        
        if(choice == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Of corse! Who doesn't");           
        }else{
            JOptionPane.showMessageDialog(null,"We'll have to agree to desagree");
        }
    }
    
}
