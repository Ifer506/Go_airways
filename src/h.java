import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JComboBox;

class h extends JFrame implements ItemListener
{
    private final String text = "Instagram";
    private final JLabel hyperlink = new JLabel(new ImageIcon("Instagram.png"));
    private final String text1 = "Facebook";
    private final JLabel hyperlink1 = new JLabel(new ImageIcon("Facebook.png"));
    private final String text2 = "Reddit";
    private final JLabel hyperlink2 = new JLabel(new ImageIcon("Reddit.png"));

    JMenuBar mb;
    JMenu fi, fr, c19, au;

    JMenuItem mi;
    JMenuItem aa, ab;

    JLabel heading = new JLabel("GO Airways");
    JLabel from = new JLabel("From");
    JLabel to = new JLabel("To");
    JLabel nationality = new JLabel("Nationality");

    JButton searchButton = new JButton("Search Flight");

    JLabel img1 = new JLabel(new ImageIcon("1.jpg"));

    JLabel body = new JLabel("Popular Destinations");
    JLabel img2 = new JLabel(new ImageIcon("4.jpg"));
    JLabel img3 = new JLabel(new ImageIcon("5.jpg"));
    JLabel img4 = new JLabel(new ImageIcon("6.jpg"));
    JLabel img5 = new JLabel(new ImageIcon("7.jpg"));

    JButton img6 = new JButton(new ImageIcon("Login.png"));

    JLabel footerHeading1 = new JLabel("Get To Know Us");
    JLabel footerHeading1Content1 = new JLabel("About Us");
    JLabel footerHeading1Content2 = new JLabel("Careers");
    JLabel footerHeading1Content3 = new JLabel("FAQ");
    JLabel footerHeading2 = new JLabel("Contact Us");
    JLabel footerHeading2Content = new JLabel("<html> Reservation: <br> +977 1 1234567  <br> Online Reservation: <br> +977 1 2345678, +977 1 3456789 <br> Email: abcd@gmail.com </html>");
    JLabel footerHeading3 = new JLabel("Follow Us");

    JRadioButton r1 = new JRadioButton();
    JRadioButton r2 = new JRadioButton();
    JRadioButton r3 = new JRadioButton();

    ButtonGroup bg = new ButtonGroup();

    public h() throws HeadlessException
    {
        super();

        hyperlink.setForeground(Color.BLUE.darker());
        hyperlink.setCursor(new Cursor(Cursor.HAND_CURSOR));
        hyperlink1.setForeground(Color.BLUE.darker());
        hyperlink1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        hyperlink2.setForeground(Color.BLUE.darker());
        hyperlink2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        hyperlink.addMouseListener(new MouseAdapter()
                                   {

                                       @Override
                                       public void mouseClicked(MouseEvent e)
                                       {
                                           try
                                           {
                                               Desktop.getDesktop().browse(new URI("https://www.facebook.com/AvinavBhatta/"));
                                           }
                                           catch (IOException | URISyntaxException e1)
                                           {
                                               e1.printStackTrace();
                                           }
                                       }

                                       @Override
                                       public void mouseExited(MouseEvent e)
                                       {
                                           hyperlink.setText(text);
                                       }

                                       @Override
                                       public void mouseEntered(MouseEvent e)
                                       {
                                           hyperlink.setText("<html> <a href = '' >" + text + "</a </html>");
                                       }

                                   }
        );

        hyperlink1.addMouseListener(new MouseAdapter()
                                   {

                                       @Override
                                       public void mouseClicked(MouseEvent e)
                                       {
                                           try
                                           {
                                               Desktop.getDesktop().browse(new URI("https://www.instagram.com/hoaxn_/"));
                                           }
                                           catch (IOException | URISyntaxException e1)
                                           {
                                               e1.printStackTrace();
                                           }
                                       }

                                       @Override
                                       public void mouseExited(MouseEvent e)
                                       {
                                           hyperlink1.setText(text1);
                                       }

                                       @Override
                                       public void mouseEntered(MouseEvent e)
                                       {
                                           hyperlink1.setText("<html> <a href = '' >" + text1 + "</a> </html>");
                                       }

                                   }
        );

        hyperlink2.addMouseListener(new MouseAdapter()
                                    {

                                        @Override
                                        public void mouseClicked(MouseEvent e)
                                        {
                                            try
                                            {
                                                Desktop.getDesktop().browse(new URI("https://www.reddit.com/user/Hoaxn-"));
                                            }
                                            catch (IOException | URISyntaxException e1)
                                            {
                                                e1.printStackTrace();
                                            }
                                        }

                                        @Override
                                        public void mouseExited(MouseEvent e)
                                        {
                                            hyperlink2.setText(text2);
                                        }

                                        @Override
                                        public void mouseEntered(MouseEvent e)
                                        {
                                            hyperlink2.setText("<html> <a href = '' >" + text2 + "</a> </html>");
                                        }

                                    }
        );


        hyperlink.setBounds(601, 540, 94, 40);
        add(hyperlink);
        hyperlink1.setBounds(601, 570, 91, 40);
        add(hyperlink1);
        hyperlink2.setBounds(597, 603, 80, 40);
        add(hyperlink2);

        setBounds(0, 0, 1366, 768);
        setTitle("Home");
        getContentPane().setBackground(Color.pink);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // for menu bar
        mb = new JMenuBar();
        add(mb);

        // for menu item
        mi = new JMenuItem();
        add(mi);

        // menu bar
        fi = new JMenu("Flight Information");
        mb.add(fi);
        fr = new JMenu("Flight Routes");
        mb.add(fr);
        c19 = new JMenu("Covid - 19");
        mb.add(c19);
        au = new JMenu("About Us");
        mb.add(au);

        // menu bar items
        aa = new JMenuItem("Flight Status");
        fi.add(aa);
        ab = new JMenuItem("Ticket Status");
        fi.add(ab);

        setJMenuBar(mb);

        // placing labels
        heading.setBounds(0, 0, 156, 40);
        heading.setFont(new Font("serif", Font.BOLD, 30));
        add(heading);
        from.setBounds(0, 265, 156, 40);
        from.setFont(new Font("serif", Font.BOLD, 20));
        add(from);
        to.setBounds(101, 265, 156, 40);
        to.setFont(new Font("serif", Font.BOLD, 20));
        add(to);
        nationality.setBounds(201, 265, 156, 40);
        nationality.setFont(new Font("serif", Font.BOLD, 20));
        add(nationality);
        footerHeading1.setBounds(1, 515, 141, 40);
        footerHeading1.setFont(new Font("serif", Font.BOLD, 20));
        add(footerHeading1);
        footerHeading2.setBounds(401, 515, 94, 40);
        footerHeading2.setFont(new Font("serif", Font.BOLD, 20));
        add(footerHeading2);
        footerHeading3.setBounds(601, 515, 82, 40);
        footerHeading3.setFont(new Font("serif", Font.BOLD, 20));
        add(footerHeading3);
        searchButton.setBounds(301, 300, 110, 20);
        add(searchButton);
        footerHeading1Content1.setBounds(1, 540, 82, 40);
        footerHeading1Content1.setFont(new Font("serif", Font.PLAIN, 15));
        add(footerHeading1Content1);
        footerHeading1Content2.setBounds(1, 570, 82, 40);
        footerHeading1Content2.setFont(new Font("serif", Font.PLAIN, 15));
        add(footerHeading1Content2);
        footerHeading1Content3.setBounds(1, 600, 82, 40);
        footerHeading1Content3.setFont(new Font("serif", Font.PLAIN, 15));
        add(footerHeading1Content3);
        footerHeading2Content.setBounds(401, 550, 120, 140);
        footerHeading2Content.setFont(new Font("serif", Font.PLAIN, 15));
        add(footerHeading2Content);
        body.setBounds(535, 270, 174, 140);
        body.setFont(new Font("serif", Font.BOLD, 20));
        add(body);

        // placing image for the slideshow
        img1.setBounds(100, 50, 550, 200);
        add(img1);

        // placing images
        img2.setBounds(1, 370, 200, 150);
        add(img2);
        img3.setBounds(200, 370, 300, 150);
        add(img3);
        img4.setBounds(515, 370, 300, 150);
        add(img4);
        img5.setBounds(830, 370, 300, 150);
        add(img5);
        img6.setBounds(1305, 12, 36, 36);
        img6.setBackground(Color.pink);
        add(img6);

        // placing radio buttons
        r1.setBounds(350, 260, 20, 13);
        r1.setBackground(Color.pink);
        r1.setSelected(true);
        r1.addItemListener(this);
        add(r1);
        bg.add(r1);

        r2.setBounds(370, 260, 20, 13);
        r2.setBackground(Color.pink);
        r2.addItemListener(this);
        add(r2);
        bg.add(r2);

        r3.setBounds(390, 260, 20, 13);
        r3.setBackground(Color.pink);
        r3.addItemListener(this);
        add(r3);
        bg.add(r3);

        // adding a comboBox
        String [] fromCities = {"Kathmandu", "Bhairahawa", "Bharatpur", "Biratnagar", "Dhangadhi", "Pokhara"};
        String [] toCities = {"Kathmandu", "Bhairahawa", "Bharatpur", "Biratnagar", "Dhangadhi", "Pokhara"};
        String [] nationality = {"Nepalese", "Chinese", "Indian"};

        JComboBox <String> comboBox1 = new JComboBox < > (fromCities);
        comboBox1.setBounds(1, 300, 100, 20);
        add(comboBox1);

        JComboBox <String> comboBox2 = new JComboBox < > (toCities);
        comboBox2.setBounds(101, 300, 100, 20);
        add(comboBox2);

        JComboBox <String> comboBox3 = new JComboBox < > (nationality);
        comboBox3.setBounds(201, 300, 100, 20);
        add(comboBox3);

    }

    // to change images by clicking on the radio buttons
    public void itemStateChanged(ItemEvent e)
    {
        if (r1.isSelected())
        {
            img1.setIcon(new ImageIcon("1.jpg"));
        }
        else if (r2.isSelected())
        {
            img1.setIcon(new ImageIcon("2.jpg"));
        }
        else if (r3.isSelected())
        {
            img1.setIcon(new ImageIcon("3.jpg"));
        }
    }

        public static void main(String[] args)
    {
        new h().setVisible(true);
    }
}

