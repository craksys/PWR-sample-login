package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JPanel implements ActionListener{
    JPanel panel = new JPanel();
    JFrame frame = new JFrame("Logowanie do indexu");
    JTextArea logintext;
    JTextArea passwordtext;
    JButton check = new JButton("Zaloguj");
    JButton clear = new JButton("Wyczyść");
    JPasswordField password = new JPasswordField(12);
    JTextField login = new JTextField(12);
    Database database = new Database();

    public Window(){
        check.addActionListener(this);
        clear.addActionListener(this);
    }


    public void windowopen (){

        database.addusers();

        panel.setLayout(null);
        panel.setBackground(Color.white);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea logintext = new JTextArea("Login: ");
        logintext.setEditable(false);
        logintext.setBounds(170,73,50,20);
        logintext.setFont(logintext.getFont().deriveFont(12f));
        panel.add(logintext);


        login.setFont(login.getFont().deriveFont(12f));
        login.setVisible(true);
        login.setBounds(225,70,150,25);
        panel.add(login);

        password.setFont(password.getFont().deriveFont(12f));
        password.setBounds(225,110,150,25);
        password.setVisible(true);
        panel.add(password);

        JTextArea passwordtext = new JTextArea("Hasło: ");
        passwordtext.setEditable(false);
        passwordtext.setBounds(170,113,50,20);
        passwordtext.setFont(passwordtext.getFont().deriveFont(12f));
        panel.add(passwordtext);

        check.setBounds(190,165,90,20);
        panel.add(check);

        clear.setBounds(310,165,90,20);
        panel.add(clear);


        frame.setLocation(400,100);
        frame.setPreferredSize(new Dimension(580, 340));
        frame.pack();
        frame.add(panel);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.repaint();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        String loginget = login.getText();
        char[] passwordget = password.getPassword();

        if(source == check) {
            database.authorization(loginget,passwordget);
            if(database.authorization(loginget, passwordget)){
                panel.setBackground(Color.green);
            }else {
                panel.setBackground(Color.red);
            }
        }
            else if(source == clear){
                password.setText("");
                login.setText("");
            }
            passwordget = new char[]{'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'};
        }
    }

