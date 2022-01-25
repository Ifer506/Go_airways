import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class btn5 extends JFrame implements ActionListener {
    JLabel goAir = new JLabel("Go Airways");
//    JLabel desc = new JLabel("DESCRIPTION");
    JButton au = new JButton("About Us");
    JButton fd = new JButton("Flight Details");
    public btn5(){
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.decode("#22282C"));
        setLayout(null);

        JLabel lbl0 = new JLabel("ATR 72-600");
        JLabel lbl1 = new JLabel("Bombardier CRJ700");
        JLabel lbl2 = new JLabel("Bombardier Dash 8 Q400");

        ImageIcon img0 = new ImageIcon("airbus1.jpg");
        Image icon = img0.getImage().getScaledInstance(300,225,Image.SCALE_DEFAULT);



        ImageIcon img1 = new ImageIcon("airbus2.jpg");
        Image icon1 = img1.getImage().getScaledInstance(300,225,Image.SCALE_DEFAULT);

        ImageIcon img2 = new ImageIcon("airbus3.JPG");
        Image icon2 = img2.getImage().getScaledInstance(300,225,Image.SCALE_DEFAULT);

        JButton btn0 = new JButton(new ImageIcon(icon));
        JButton btn1 = new JButton(new ImageIcon(icon1));
        JButton btn2 = new JButton(new ImageIcon(icon2));

        btn0.setBounds(115,100,300,225);
        lbl0.setBounds(210,325,150,20);
        lbl0.setForeground(new Color(0,200,200));

        btn1.setBounds(475,100,300,225);
        lbl1.setBounds(570,325,150,20);
        lbl1.setForeground(new Color(0,200,200));

        btn2.setBounds(830,100,300,225);
        lbl2.setBounds(930,325,150,20);
        lbl2.setForeground(new Color(0,200,200));





        au.addActionListener(this);

        goAir.setBounds(10,10,200,50);
        goAir.setFont(new Font("Times",Font.BOLD, 30));
        goAir.setForeground(new Color(0,200,200));

        au.setBounds(250,50,90,30);
        au.setBackground(new Color(0,0,150));
        au.setForeground(new Color(0,200,200));

        fd.setBounds(350,50,110,30);
        fd.setBackground(new Color(0,0,150));
        fd.setForeground(new Color(0,200,200));

//        desc.setBounds(250,200,1000,200);
//        desc.setForeground(new Color(0,200,200));
//        desc.setFont(new Font("Times",Font.BOLD, 20));

        add(goAir);
        add(au);
        add(fd);
//        add(desc);
        add(lbl0);
        add(lbl1);
        add(lbl2);
        add(btn0);
        add(btn1);
        add(btn2);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==au){
            dispose();
            new AboutGo().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new btn5().setVisible(true);
    }
}
