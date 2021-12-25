import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlightDetails extends JFrame implements ActionListener {
    // Changing image size
    ImageIcon icon1 = new ImageIcon("C:/Users/dell/Downloads/search.png/");
    Image scaleImage1 = icon1.getImage().getScaledInstance(50, 20,Image.SCALE_DEFAULT);
    // 1st Row
    ImageIcon icon = new ImageIcon("Screenshot (3).png");
    Image scaleImage = icon.getImage().getScaledInstance(255, 257,Image.SCALE_DEFAULT);
    ImageIcon icon2 = new ImageIcon("5625.jpg");
    Image scaleImage2 = icon2.getImage().getScaledInstance(255, 257,Image.SCALE_DEFAULT);
    ImageIcon icon3 = new ImageIcon("55358.jpg");
    Image scaleImage3 = icon3.getImage().getScaledInstance(255, 257,Image.SCALE_DEFAULT);
    ImageIcon icon4 = new ImageIcon("59467.jpg");
    Image scaleImage4 = icon4.getImage().getScaledInstance(255, 257,Image.SCALE_DEFAULT);
    ImageIcon icon5 = new ImageIcon("67552.jpg");
    Image scaleImage5 = icon5.getImage().getScaledInstance(255, 257,Image.SCALE_DEFAULT);
    // 2nd Row
    ImageIcon icon6 = new ImageIcon("93586.jpg");
    Image scaleImage6 = icon6.getImage().getScaledInstance(255, 257,Image.SCALE_DEFAULT);
    ImageIcon icon7 = new ImageIcon("98407.jpg");
    Image scaleImage7 = icon7.getImage().getScaledInstance(255, 257,Image.SCALE_DEFAULT);
    ImageIcon icon8 = new ImageIcon("251276.jpg");
    Image scaleImage8 = icon8.getImage().getScaledInstance(255, 257,Image.SCALE_DEFAULT);
    ImageIcon icon9 = new ImageIcon("765769.jpg");
    Image scaleImage9 = icon9.getImage().getScaledInstance(255, 257,Image.SCALE_DEFAULT);
    ImageIcon icon10 = new ImageIcon("1545103.jpg");
    Image scaleImage10 = icon10.getImage().getScaledInstance(255, 257,Image.SCALE_DEFAULT);

    JButton back = new JButton("BACK");
    JButton searchb = new JButton(new ImageIcon(scaleImage1));
    JButton image0 = new JButton(new ImageIcon(scaleImage));
    JButton image1 = new JButton(new ImageIcon(scaleImage5));
    JButton image2 = new JButton(new ImageIcon(scaleImage2));
    JButton image3 = new JButton(new ImageIcon(scaleImage3));
    JButton image4 = new JButton(new ImageIcon(scaleImage4));
    JButton image5 = new JButton(new ImageIcon(scaleImage6));
    JButton image6 = new JButton(new ImageIcon(scaleImage7));
    JButton image7 = new JButton(new ImageIcon(scaleImage8));
    JButton image8 = new JButton(new ImageIcon(scaleImage9));
    JButton image9 = new JButton(new ImageIcon(scaleImage10));
    JTextField search = new JTextField();
    JLabel fd = new JLabel("Flight Details");
    JLabel click = new JLabel("(Click on pictures to view details)");
    JLabel contact = new JLabel("For more Information, Call:- +977 9810101010 OR E-mail:- FMS10@email.com");


    public FlightDetails(){
        setTitle("Flight Details");
        setLayout(null);
        // setBounds(-5,0,1290,723);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(255,255,255));
        // To start the window maximized
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        searchb.addActionListener(this);
        back.addActionListener(this);
        image0.addActionListener(this);
        image1.addActionListener(this);
        image2.addActionListener(this);
        image3.addActionListener(this);
        image4.addActionListener(this);
        image5.addActionListener(this);
        image6.addActionListener(this);
        image7.addActionListener(this);
        image8.addActionListener(this);
        image9.addActionListener(this);

        fd.setFont(new Font("Times", Font.BOLD, 25));
        contact.setFont(new Font("Times", Font.BOLD, 20));
        search.setFont(new Font("Times", Font.BOLD, 20));

        back.setBounds(5,5,69,20);
        search.setBounds(1100,100,150,40);
        searchb.setBounds(1060,100,40,40);
        image0.setBounds(3,150,250,257);
        image1.setBounds(258,150,250,257);
        image2.setBounds(514,150,250,257);
        image3.setBounds(769,150,250,257);
        image4.setBounds(1027,150,250,257);
        image5.setBounds(3,410,250,257);
        image6.setBounds(258,410,250,257);
        image7.setBounds(514,410,250,257);
        image9.setBounds(769,410,250,257);
        image8.setBounds(1027,410,250,257);
        fd.setBounds(550,10,500,40);
        contact.setBounds(268,664,750,40);
        click.setBounds(540,130,200,20);

        add(back);
        add(search);
        add(searchb);
        add(image0);
        add(image1);
        add(image2);
        add(image3);
        add(image4);
        add(image5);
        add(image6);
        add(image7);
        add(image8);
        add(image9);
        add(fd);
        add(contact);
        add(click);
    }
    public void actionPerformed(ActionEvent a){
        if(a.getSource()==back){
            dispose();
        }
        if(a.getSource()==searchb){
            String entered = search.getText();
            if (entered.length() == 0){
                search.setFont(new Font("Times", Font.ITALIC, 10));
                search.setForeground(Color.red);
                search.setText("Please, Enter a valid keyword");
            }
            System.out.println(entered);
        }
        if(a.getSource()==image0){
            String time = "10:10";
            JOptionPane.showMessageDialog(null,"Time:- "+time);
        }
        if(a.getSource()==image1){
            String time = "10:10";
            JOptionPane.showMessageDialog(null,"Time:- "+time);
        }
        if(a.getSource()==image2){
            String time = "10:10";
            JOptionPane.showMessageDialog(null,"Time:- "+time);
        }
        if(a.getSource()==image3){
            String time = "10:10";
            JOptionPane.showMessageDialog(null,"Time:- "+time);
        }
        if(a.getSource()==image4){
            String time = "10:10";
            JOptionPane.showMessageDialog(null,"Time:- "+time);
        }
        if(a.getSource()==image5){
            String time = "10:10";
            JOptionPane.showMessageDialog(null,"Time:- "+time);
        }
        if(a.getSource()==image6){
            String time = "10:10";
            JOptionPane.showMessageDialog(null,"Time:- "+time);
        }
        if(a.getSource()==image7){
            String time = "10:10";
            JOptionPane.showMessageDialog(null,"Time:- "+time);
        }
        if(a.getSource()==image8){
            String time = "10:10";
            JOptionPane.showMessageDialog(null,"Time:- "+time);
        }
        if(a.getSource()==image9){
            String time = "10:10";
            JOptionPane.showMessageDialog(null,"Time:- "+time);
        }
    }

    public static void main(String[] args) {
        new FlightDetails().setVisible(true);
    }
}

