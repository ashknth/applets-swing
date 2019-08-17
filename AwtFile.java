package com.ashok.np;

import javax.swing.*;
import java.awt.*;


/**
 * Created by ashoknath on 8/16/19.
 */
public class AwtFile {
    public static void main(String[] args) {
        JFrame frame = new JFrame();  //creating a frame
        frame.setSize(500,300);       // setting a frame size

        JLabel label = new JLabel("Name:");    // a label for name
        label.setBounds(150, 60, 100,20);      // label size
        frame.add(label);                      // add label

        JTextField tf = new JTextField();   //text field of name
       tf.setBounds(200,60,250,20);     //bounds for label
        tf.setText("Enter your name"); //place holder
        frame.add(tf);   //adding textfield

        JLabel label2 = new JLabel("Pass:");
        label2.setBounds(150, 100, 100,20);
        frame.add(label2);

        JTextField tf2 = new JTextField();
        tf2.setBounds(200,100,250,20);
        tf2.setText("Enter your password");
        frame.add(tf2);


        JButton button = new JButton("Click");
        button.setBounds(200, 150, 100, 40);
        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize(); // this syntax will make your application
      // int height=screensize.height;                                      //to the half of your screen size of laptop
       //int width=screensize.width;
       //frame.setSize(width/2,height/2);
        
       frame.setLocationRelativeTo(null);  // this syntax will set your application in  the center of the screen

    }
}
