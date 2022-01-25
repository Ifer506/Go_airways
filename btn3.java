import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class btn3 extends JFrame implements ActionListener {
    JLabel goAir = new JLabel("Go Airways");
    JLabel desc = new JLabel("<html>To connect the world, we first have to reflect the world. That’s why go airliness actively seeks diversity,<br>" +
            "The Go airways family will use whatever to move the world toward a better, more then just tomorrow.</htm>");
    JButton au = new JButton("About Us");
    JButton fd = new JButton("Flight Details");
    public btn3(){
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.decode("#22282C"));
        setLayout(null);

        au.addActionListener(this);

        goAir.setBounds(10,10,200,50);
        goAir.setFont(new Font("Times",Font.BOLD, 45));
        goAir.setForeground(new Color(0,200,200));

        au.setBounds(250,50,90,30);
        au.setBackground(new Color(0,0,150));
        au.setForeground(new Color(0,200,200));

        fd.setBounds(350,50,110,30);
        fd.setBackground(new Color(0,0,150));
        fd.setForeground(new Color(0,200,200));

        desc.setBounds(250,200,1000,200);
        desc.setForeground(new Color(0,200,200));
        desc.setFont(new Font("Times",Font.BOLD, 25));

        add(goAir);
        add(au);
        add(fd);
        add(desc);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==au){
            dispose();
            new AboutGo().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new btn3().setVisible(true);
    }
}
