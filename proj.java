import suruko.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class proj extends JFrame implements ActionListener{
    JLabel f_name;
    JLabel l_name;
    JLabel phone;
    JLabel email;
    JLabel passcode;
    JLabel passcode_1;
    JLabel dob;
    JLabel gender;

    JTextField F_name;
    JTextField L_name;
    JTextField Phone;
    JTextField Email;
    JTextField Passcode;
    JTextField Passcode_1;
    JTextField Dob;

    JButton confirm;
    JRadioButton male;
    JRadioButton female;
    JRadioButton custom;



    public proj(){

        setTitle("REGISTRARION");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(200,200,450,600);
        setResizable(false);
        setLayout(null);

        f_name = new JLabel("First name :");
        l_name = new JLabel("Last name :");
        phone = new JLabel("Phone :");
        email = new JLabel("Email :");
        passcode = new JLabel("Password :");
        passcode_1 = new JLabel("Confirm Password :");
        dob = new JLabel("DOB :");
        gender = new JLabel("Gender :");
        F_name = new JTextField();
        L_name = new JTextField();
        Phone= new JTextField();
        Email = new JTextField();
        Passcode = new JTextField();
        Passcode_1 = new JTextField();
        Dob = new JTextField();
        confirm = new JButton("CONFIRM");
        male = new JRadioButton("MALE");
        female = new JRadioButton("FEMALE");
        custom = new JRadioButton("CUSTOM");

        f_name.setBounds(20,10,170,120);
        l_name.setBounds(20,50,170,120);
        phone.setBounds(20,90,170,120);
        email.setBounds(20,130,170,120);
        dob.setBounds(20,170,170,120);
        passcode.setBounds(20,210,170,120);
        passcode_1.setBounds(20,250,170,120);
        gender.setBounds(20,290,170,120);


        F_name.setBounds(190,60,170,20);
        L_name.setBounds(190,100,170,20);
        Phone.setBounds(190,140,170,20);
        Email.setBounds(190,180,170,20);
        Dob.setBounds(190,220,170,20);
        Passcode.setBounds(190,260,170,20);
        Passcode_1.setBounds(190,300,170,20);
        male.setBounds(190,340,100,30);
        female.setBounds(290,340,100,30);
        custom.setBounds(190,370,100,30);

        confirm.setBounds(190,420,100,30);


        add(f_name);
        add(l_name);
        add(phone);
        add(email);
        add(dob);
        add(passcode);
        add(passcode_1);
        add(gender);

        add(F_name);
        add(L_name);
        add(Phone);
        add(Email);
        add(Dob);
        add(Passcode);
        add(Passcode_1);

        add(confirm);
        add(male);
        add(female);
        add(custom);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args){
        new proj().setVisible(true);
    }
}
