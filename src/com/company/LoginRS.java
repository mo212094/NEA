package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LoginRS implements ActionListener {


    private static JLabel userlabel;     // creates private variables
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;



    public static void main(String[] args) {
        JPanel panel = new JPanel(); // creates a new panel
        JFrame frame = new JFrame(); //creates a new label
        frame.setSize(400, 400); // sets the size of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes program when exiting meaning the program doesn't run in the background
        frame.setVisible(true);
        frame.add(panel);
        panel.setLayout(null);


        userlabel = new JLabel("User"); // Creates a user label
        userlabel.setBounds(10,20,80,25);  //Sets size and location of the label
        panel.add(userlabel); // Adds label to the window

        userText = new JTextField();
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        button = new JButton("Login");  //Creates a button labelled login
        button.setBounds(10,80,80,25);
        button.addActionListener(new LoginRS());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10,110,300,25);
        panel.add(success);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText(); // gets the username from the input within the user label
        String password = passwordText.getText();// gets the password from the input within the password label
        System.out.println(user + ", " + password);
        if (user.equals("Maeve") && password.equals("O'Shea")){
            success.setText("Login Successful");
        }
    }
}





