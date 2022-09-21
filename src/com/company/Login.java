package com.company;
import java.util.*;
import javax.swing.JOptionPane;

    public class Login {
        public static String username = "maeve";
        public static String password = "oshea";

        public static void main(String[] args) {
            int input = JOptionPane.showConfirmDialog(null, "Do you want to login?");
            // 0=yes, 1=no, 2=cancel
            if(input == 0){
                //login() login method
                boolean check = true;
                while(check == true) {
                    String Cusername = JOptionPane.showInputDialog("Provide User Name:");
                    if (Cusername.equals(username)) {
                        String Upassword = JOptionPane.showInputDialog("Provide Password:");
                        if (Upassword.equals(password)) {
                            JOptionPane.showMessageDialog(null, "Login successful. Welcome " + username);
                        }
                        check = false;
                        if (!Upassword.equals(password)) {
                            JOptionPane.showMessageDialog(null, "Invalid password");
                            check = true;
                        }
                    }
                    if (!Cusername.equals(username)) {
                        JOptionPane.showMessageDialog(null, "Invalid username");
                    }
                }
                //JOptionPane.showMessageDialog(null, username);
            }if(input == 1){
                //ask do you want to sign up
                int input2 = JOptionPane.showConfirmDialog(null, "Do you want to sign up?");
                // 0=yes, 1=no, 2=cancel
                System.out.println(input2);
                if(input2 == 0){
                    //signup() sign up method
                    username = JOptionPane.showInputDialog( "Provide User Name:" );
                    boolean check = true;
                    while(check == true) {
                        password = JOptionPane.showInputDialog("Provide Password:");
                        String Cpassword = JOptionPane.showInputDialog("Confirm Password:");
                        if (password.equals(Cpassword)) {
                            JOptionPane.showMessageDialog(null, "Sign Up successful");
                            check = false;
                            JOptionPane.showMessageDialog(null, "Username: " + username + "\nPassword: " + password);
                        } else if (!password.equals(Cpassword)) {
                            JOptionPane.showMessageDialog(null, "Passwords do not match");
                            check = true;
                        }
                    }

                }if(input2 == 1){
                    //guest
                }if(input2 == 2){
                    //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }if(input == 2){
                //close system
            }

        }
    }
