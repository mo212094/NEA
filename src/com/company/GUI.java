package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    int count  = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;

    public GUI(){
        JFrame frame = new JFrame();

        JButton button = new JButton("Click me");
        button.addActionListener(this);

        JLabel label = new JLabel("NUmber of clicks : 0");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(500,500,500,500));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args){
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
    }
}