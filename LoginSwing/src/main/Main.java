package main;

import javax.swing.JFrame;

import view.LoginScreen;


public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setContentPane(new LoginScreen(frame));
        frame.setVisible(true);
    }
}
