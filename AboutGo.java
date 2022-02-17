import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AboutGo extends JFrame implements ActionListener {
    JLabel goAir = new JLabel("Go Airways");
    JButton au = new JButton("About Us");
    JButton fd = new JButton("Flight Details");

    ImageIcon img0 = new ImageIcon("photo1.jpg");
    Image icon = img0.getImage().getScaledInstance(300,225,Image.SCALE_DEFAULT);
    ImageIcon img1 = new ImageIcon("photo4.png");
    Image icon0 = img1.getImage().getScaledInstance(300,225,Image.SCALE_DEFAULT);
//    Icon icon0 = new ImageIcon("photo4.png");
    ImageIcon img2 = new ImageIcon("photo3.jpeg");
    Image icon1 = img2.getImage().getScaledInstance(300,225,Image.SCALE_DEFAULT);
//    Icon icon1 = new ImageIcon("photo3.jpeg");
    ImageIcon img3 = new ImageIcon("photo2.jpg");
    Image icon2 = img3.getImage().getScaledInstance(300,225,Image.SCALE_DEFAULT);
//    Icon icon2 = new ImageIcon("photo2.jpg");
    ImageIcon img4 = new ImageIcon("photo5.jpg");
    Image icon3 = img4.getImage().getScaledInstance(300,225,Image.SCALE_DEFAULT);
//    Icon icon3 = new ImageIcon("photo5.jpg");
    ImageIcon img5 = new ImageIcon("photo6.jpg");
    Image icon4 = img5.getImage().getScaledInstance(300,225,Image.SCALE_DEFAULT);
//    Icon icon4 = new ImageIcon("photo6.jpg");
    JButton btn0 = new JButton(new ImageIcon(icon));
    JButton btn1 = new JButton(new ImageIcon(icon0));
    JButton btn3 = new JButton(new ImageIcon(icon2));
    JButton btn2 = new JButton(new ImageIcon(icon1));
    JButton btn4 = new JButton(new ImageIcon(icon3));
    JButton btn5 = new JButton(new ImageIcon(icon4));

    JLabel lbl0 = new JLabel("About Go Airways");
    JLabel lbl1 = new JLabel("Community Agreements");
    JLabel lbl2 = new JLabel("Carbon Neutral");
    JLabel lbl3 = new JLabel("Diversity, Equity and Involvement");
    JLabel lbl4 = new JLabel("Our Aircrafts ");
    JLabel lbl5 = new JLabel("Board Of Director");


    public AboutGo(){
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.decode("#22282C"));
        setLayout(null);

        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);

        goAir.setBounds(10,10,200,50);
        goAir.setFont(new Font("Times",Font.BOLD, 30));
        goAir.setForeground(new Color(0,200,200));

        au.setBounds(250,50,90,30);
        au.setBackground(new Color(0,0,150));
        au.setForeground(new Color(0,200,200));

        fd.setBounds(350,50,110,30);
        fd.setBackground(new Color(0,0,150));
        fd.setForeground(new Color(0,200,200));

        btn0.setBounds(125,100,300,225);
        lbl0.setBounds(195,325,150,20);
        lbl0.setForeground(new Color(0,200,200));

        btn1.setBounds(475,100,300,225);
        lbl1.setBounds(550,325,150,20);
        lbl1.setForeground(new Color(0,200,200));

        btn2.setBounds(825,100,300,225);
        lbl2.setBounds(920,325,150,20);
        lbl2.setForeground(new Color(0,200,200));

        btn3.setBounds(125,400,300,225);
        lbl3.setBounds(160,625,200,20);
        lbl3.setForeground(new Color(0,200,200));

        btn5.setBounds(475,400,300,225);
        lbl4.setBounds(580,625,150,20);
        lbl4.setForeground(new Color(0,200,200));

        btn4.setBounds(825,400,300,225);
        lbl5.setBounds(920,625,150,20);
        lbl5.setForeground(new Color(0,200,200));



        add(btn0);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(goAir);
        add(au);
        add(fd);
        add(lbl0);
        add(lbl1);
        add(lbl2);
        add(lbl3);
        add(lbl4);
        add(lbl5);
        au.setFocusable(false);
        fd.setFocusable(false);

    }
    public void actionPerformed(ActionEvent a){
        if(a.getSource()==btn0){
           dispose();
           new btn0().setVisible(true);
        }
        if(a.getSource()==btn1){
            dispose();
            new btn1().setVisible(true);
        }
        if(a.getSource()==btn2){
            dispose();
            new btn2().setVisible(true);
        }
        if(a.getSource()==btn3){
            dispose();
            new btn3().setVisible(true);
        }
        if(a.getSource()==btn4){
            dispose();
            new btn4().setVisible(true);
        }
        if(a.getSource()==btn5){
            dispose();
            new btn5().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new AboutGo().setVisible(true);
    }
}
