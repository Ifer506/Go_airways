import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class btn4 extends JFrame implements ActionListener {
    JLabel goAir = new JLabel("Go Airways");
    JLabel desc = new JLabel("");
    JButton au = new JButton("About Us");
    JButton fd = new JButton("Flight Details");

    ImageIcon img0 = new ImageIcon("btn0.png");
    Image icon0 = img0.getImage().getScaledInstance(240,225,Image.SCALE_DEFAULT);
    ImageIcon img1 = new ImageIcon("btn1.png");
    Image icon1 = img1.getImage().getScaledInstance(240,225,Image.SCALE_DEFAULT);
    ImageIcon img2 = new ImageIcon("btn2.png");
    Image icon2 = img2.getImage().getScaledInstance(240,225,Image.SCALE_DEFAULT);
    ImageIcon img3 = new ImageIcon("btn3.png");
    Image icon3 = img3.getImage().getScaledInstance(240,225,Image.SCALE_DEFAULT);
    ImageIcon img4 = new ImageIcon("btn10.JPEG");
    Image icon4 = img4.getImage().getScaledInstance(240,225,Image.SCALE_DEFAULT);

    JLabel lbl0 = new JLabel(new ImageIcon(icon0));
    JLabel lbl1 = new JLabel(new ImageIcon(icon1));
    JLabel lbl2 = new JLabel(new ImageIcon(icon2));
    JLabel lbl3 = new JLabel(new ImageIcon(icon3));
    JLabel lbl4 = new JLabel(new ImageIcon(icon4));

    JLabel name0 = new JLabel("Ruchan Kayastha(Management Information Department)");
    JLabel name1 = new JLabel("Abishek Basnet(Marketing, Sales and Ground Handling)");
    JLabel name2 = new JLabel("Karma Pasang Lama(Operation Department)");
    JLabel name3 = new JLabel("Sumedha Raj Shakya(Revenue Department)");
    JLabel name4 = new JLabel("Abinav Dev Bhatta(Finance Department)");

    public btn4(){
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.decode("#22282C"));
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

        desc.setBounds(250,200,1000,200);
        desc.setForeground(new Color(0,200,200));
        desc.setFont(new Font("Times",Font.BOLD, 20));

        lbl0.setBounds(125,100,300,225);
        name0.setBounds(120,325,340,20);
        name0.setForeground(new Color(0,200,200));

        lbl1.setBounds(475,100,300,225);
       name1.setBounds(480,325,340,20);
        name1.setForeground(new Color(0,200,200));

        lbl2.setBounds(825,100,300,225);
        name2.setBounds(845,325,260,20);
        name2.setForeground(new Color(0,200,200));

        lbl3.setBounds(325,400,300,225);
        name3.setBounds(350,625,300,20);
        name3.setForeground(new Color(0,200,200));

        lbl4.setBounds(675,400,300,225);
        name4.setBounds(800,625,250,20);
        name4.setForeground(new Color(0,200,200));

        au.setFocusable(false);
        fd.setFocusable(false);

        add(goAir);
        add(au);
        add(fd);
        add(desc);

        add(lbl0);
        add(lbl1);
        add(lbl2);
        add(lbl3);
        add(lbl4);

        add(name0);
        add(name1);
        add(name2);
        add(name3);
        add(name4);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==au){
            dispose();
            new AboutGo().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new btn4().setVisible(true);
    }
}
