
package javaapplication20;


import java.awt.*;
import javax.swing.*;


public class SimpleFrame {
 
    
    public static void main (String []args){
        
        JFrame frame = new JFrame();
        Image icon = Toolkit.getDefaultToolkit().getImage("icon.gift");
        frame.setIconImage(icon);
        JPanel panel = (JPanel) frame.getContentPane();
        panel.setBackground(Color.white);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500,200));
        
        JLabel label = new JLabel("Type your ZIP code: ");
        frame.add(label);
        
        
        JTextField field = new JTextField(5);
        frame.add(field);
        
        //Ordenar cada uno de lo elementos
        frame.setLayout(new FlowLayout()); //<---
                
                
        JButton button = new JButton();
        button.setText("HOLA");
        button.setBackground(Color.blue);
        frame.add(button);
        
        JButton button1 = new JButton();
        button1.setText("Click");
        button1.setBackground(Color.red);
        frame.add(button1);
        
        button.addActionListener(new MessageListener());
        //LAYOUT ES PARA ORDENAR <---
//        
//        frame.setLayout(new BorderLayout()); //<---
//        
//        frame.add(new JButton("north"), BorderLayout.NORTH);
//        frame.add(new JButton("south"), BorderLayout.SOUTH);
//        frame.add(new JButton("west"), BorderLayout.WEST);
//        frame.add(new JButton("east"), BorderLayout.EAST);
//        frame.add(new JButton("center"), BorderLayout.CENTER);
        
        
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2,
                dim.height/2-frame.getSize().height/2);
        frame.setTitle("A frame");
        frame.setVisible(true);
        
    }
    
}
