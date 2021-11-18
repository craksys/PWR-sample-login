package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener{
    JTextField login;
    JPanel panel = new JPanel();
    JFrame frame = new JFrame("Logowanie do indexu");
    JTextArea logintext;
    JTextArea passwordtext;
    JPasswordField password;
    JButton check;
    JButton clear;


    public void windowopen (){

        panel.setLayout(null);
        panel.setBackground(Color.white);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setIconImage(new ImageIcon("http://craksys.tk/files/yonk-dark-wolf-comic-avatar-commission.png").getImage());
        JTextArea logintext = new JTextArea("Login: ");
        logintext.setEditable(false);
        logintext.setBounds(170,73,50,20);
        logintext.setFont(logintext.getFont().deriveFont(12f));
        panel.add(logintext);

        JTextField login = new JTextField(12);
        login.setFont(login.getFont().deriveFont(12f));
        login.setVisible(true);
        login.setBounds(225,70,150,25);
        panel.add(login);

        JPasswordField password = new JPasswordField(12);
        password.setFont(password.getFont().deriveFont(12f));
        password.setBounds(225,110,150,25);
        password.setVisible(true);
        panel.add(password);

        JTextArea passwordtext = new JTextArea("Hasło: ");
        passwordtext.setEditable(false);
        passwordtext.setBounds(170,113,50,20);
        passwordtext.setFont(passwordtext.getFont().deriveFont(12f));
        panel.add(passwordtext);

        JButton check = new JButton("Zaloguj");
        check.setBounds(190,165,90,20);
        panel.add(check);

        JButton clear = new JButton("Wyczyść");
        clear.setBounds(310,165,90,20);
        panel.add(clear);
        check.addActionListener(this::actionPerformed);




        frame.setLocation(400,100);
        frame.setPreferredSize(new Dimension(580, 340));
       // frame.add(text1);
        frame.pack();
        frame.add(panel);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.repaint();
    }
@Override
    public void actionPerformed( ActionEvent e ) {
        Object src = e.getSource();
        if( src == check) {
            System.out.println("xd");
        }
    }
}
