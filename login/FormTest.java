package login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by ashoknath on 9/1/19.
 */
public class FormTest extends JFrame implements ActionListener {
    JPanel panel;
    JTextField textField;
    JPasswordField passwordField;
    JButton button;
    JLabel label1;
    JLabel label2;
    String un="Ncit";
    String pw="Ncit";

    FormTest() {
        JPanel panel = new JPanel(new GridLayout(3, 1));
        JLabel label1 = new JLabel();
        JTextField textField = new JTextField(15);
        JPasswordField passwordField = new JPasswordField();
        JLabel label2 = new JLabel();
        label1.setText("UserName:");
        label2.setText("Password");
        panel.add(label1);
        panel.add(textField);
        panel.add(label2);
        panel.add(passwordField);
        JButton button = new JButton("Login");
        panel.add(button);
        button.addActionListener(this);
        add(panel, BorderLayout.CENTER);
        setLocationRelativeTo(null);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String userName = textField.getText();
        String passWord = String.valueOf(passwordField.getPassword());
       // String passWord = String.valueOf(passwordField.getPassword());
        if(userName.equals(un) && passWord.equals(pw))
        {
            NewPage page = new NewPage();
            page.setVisible(true);


        }
    }
}
