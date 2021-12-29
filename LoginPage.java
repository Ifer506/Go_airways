
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame implements ActionListener {
    JLabel un = new JLabel("User Name:- ");
    JLabel pw = new JLabel("Password:- ");
    JTextField UN = new JTextField();
    JPasswordField PW = new JPasswordField();
    JCheckBox sw = new JCheckBox("show");
    JButton login = new JButton("LogIn");
    JButton exit = new JButton("EXIT");

    public LoginPage() {
        setTitle("LogIn");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(300, 300, 300, 150);
        // getContentPane().setBackground(Color.white);
        login.addActionListener(this);
        sw.addActionListener(this);
        exit.addActionListener(this);
        setLayout(null);

        un.setBounds(10, 0, 100, 50);
        pw.setBounds(10, 30, 100, 50);
        UN.setBounds(110, 15, 150, 20);
        PW.setBounds(110, 45, 150, 20);
        sw.setBounds(160, 45, 100, 20);
        login.setBounds(30, 75, 100, 20);
        exit.setBounds(140, 75, 100, 20);

        add(un);
        add(pw);
        add(UN);
        add(PW);
        add(sw);
        add(login);
        add(exit);
    }
    public void actionPerformed(ActionEvent a) {
        if (a.getSource() == sw) {
            if (sw.isSelected())
                PW.setEchoChar((char) 0);
            else
                PW.setEchoChar('*');
        }
        if (a.getSource() == login) {
            String name = UN.getText();
        }
        if(a.getSource()==exit){
            dispose();
        }
    }
    public static void main(String[] args) {
        new LoginPage().setVisible(true);
    }
}
