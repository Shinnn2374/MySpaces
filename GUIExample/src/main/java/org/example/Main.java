package org.example;

import javax.swing.*;
import java.awt.*;

public class Main{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(600, 400);

        frame.setLayout( new FlowLayout());
        frame.add(new JButton("Click Me"));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}