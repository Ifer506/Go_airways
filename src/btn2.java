import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class btn2 extends JFrame implements ActionListener {
    JLabel goAir = new JLabel("Go Airways");
    JLabel desc = new JLabel("<html>go’s commitment to sustainability is about joining arms to create a better world. <br>" +
            "The airline’s ambitious commitment to carbon neutrality from feburay 2021 onward.<br>" +
            "GO is focusing  on three areas: carbon reduction and carbon removal, stakeholder engagement and coalition building.</html>");
    JButton au = new JButton("About Us");
    JButton fd = new JButton("Flight Details");
    public btn2(){
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.decode("#22282C"));
        setLayout(null);

        au.addActionListener(this);

        goAir.setBounds(10,10,200,50);
        goAir.setFont(new Font("cambria",Font.BOLD, 30));
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
        new btn2().setVisible(true);
    }
}
