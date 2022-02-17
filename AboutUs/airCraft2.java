package AboutUs;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class airCraft2 extends JFrame implements ActionListener {
    JLabel goAir = new JLabel("Go Airways");
    JLabel desc = new JLabel("<html>The Bombardier CRJ700, CRJ900, and CRJ1000 are a family of regional jet airliners" +
            " that were designed and manufactured by Canadian transportation conglomerate Bombardier" +
            " Bombardier launched the CRJ900 NextGen to replace the initial version. Its improvements and" +
            " conic nozzle enhances fuel economy  The new model has improved economics and a new cabin. This flew in pokhara Lukla  Lumbini.</htm>");
    JButton au = new JButton("About Us");
    JButton fd = new JButton("Flight Details");
    public airCraft2(){
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
        new airCraft2().setVisible(true);
    }
}
