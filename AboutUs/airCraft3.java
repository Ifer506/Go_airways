package AboutUs;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class airCraft3 extends JFrame implements ActionListener {
    JLabel goAir = new JLabel("Go Airways");
    JLabel desc = new JLabel("<html>The Bombardier Q400 is a turboprop aircraft from the de Havilland Canada Dash 8 family. " +
            "Our Bombardier Q400 is a dual turboprop aeroplane with particularly low CO₂ footprint." +
            "The Bombardier Q400 sets new standards in terms of environmental friendliness, efficiency and comfort. " +
            "Enjoy travelling across : the go Bombardier Q400 flies you to pokhara kathmandu chitwan." +
            "</htm>");
    JButton au = new JButton("About Us");
    JButton fd = new JButton("Flight Details");
    public airCraft3(){
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.decode("#22282C"));
        setLayout(null);

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
            new btn5().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new airCraft3().setVisible(true);
    }
}
