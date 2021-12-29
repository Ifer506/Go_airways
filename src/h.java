import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;

class h extends JFrame implements ItemListener
{
    JMenuBar mb;
    JMenu fi, fr, c19, au;

    JMenuItem mi;
    JMenuItem aa, ab;

    JLabel a = new JLabel("GO Airways");
    JLabel b = new JLabel("From");
    JLabel c = new JLabel("To");
    JLabel d = new JLabel("Nationality");
    JButton i = new JButton("Search Flight");

    JLabel i1 = new JLabel(new ImageIcon("1.jpg"));
    JLabel i4 = new JLabel(new ImageIcon("4.jpg"));
    JLabel i5 = new JLabel(new ImageIcon("5.jpg"));
    JLabel i6 = new JLabel(new ImageIcon("6.jpg"));
    JLabel i7 = new JLabel(new ImageIcon("7.jpg"));

    JLabel e = new JLabel("Get To Know Us");
    JLabel f = new JLabel("Legal Policies");
    JLabel g = new JLabel("Contact Us");
    JLabel h = new JLabel("Follow Us");
    JLabel j = new JLabel("About Us");
    JLabel k = new JLabel("Careers");
    JLabel l = new JLabel("FAQ");
    JLabel m = new JLabel("<html> Reservation: <br> +977 1 1234567  <br> Online Reservation: <br> +977 1 2345678, +977 1 3456789 <br> Email: abcd@gmail.com </html>");
    JLabel n = new JLabel("Popular Destinations");

    JRadioButton r1 = new JRadioButton();
    JRadioButton r2 = new JRadioButton();
    JRadioButton r3 = new JRadioButton();

    ButtonGroup bg = new ButtonGroup();

    public h()
    {
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
        a.setBounds(0, 0, 156, 40);
        a.setFont(new Font("serif", Font.BOLD, 30));
        add(a);
        b.setBounds(0, 265, 156, 40);
        b.setFont(new Font("serif", Font.BOLD, 20));
        add(b);
        c.setBounds(101, 265, 156, 40);
        c.setFont(new Font("serif", Font.BOLD, 20));
        add(c);
        d.setBounds(201, 265, 156, 40);
        d.setFont(new Font("serif", Font.BOLD, 20));
        add(d);
        e.setBounds(1, 515, 141, 40);
        e.setFont(new Font("serif", Font.BOLD, 20));
        add(e);
        f.setBounds(201, 515, 117, 40);
        f.setFont(new Font("serif", Font.BOLD, 20));
        add(f);
        g.setBounds(401, 515, 94, 40);
        g.setFont(new Font("serif", Font.BOLD, 20));
        add(g);
        h.setBounds(601, 515, 82, 40);
        h.setFont(new Font("serif", Font.BOLD, 20));
        add(h);
        i.setBounds(301, 300, 110, 20);
        add(i);
        j.setBounds(1, 540, 82, 40);
        j.setFont(new Font("serif", Font.PLAIN, 15));
        add(j);
        k.setBounds(1, 570, 82, 40);
        k.setFont(new Font("serif", Font.PLAIN, 15));
        add(k);
        l.setBounds(1, 600, 82, 40);
        l.setFont(new Font("serif", Font.PLAIN, 15));
        add(l);
        m.setBounds(401, 550, 120, 140);
        m.setFont(new Font("serif", Font.PLAIN, 15));
        add(m);
        n.setBounds(535, 270, 174, 140);
        n.setFont(new Font("serif", Font.BOLD, 20));
        add(n);

        // placing image for the slideshow
        i1.setBounds(100, 50, 550, 200);
        add(i1);

        // placing images
        i4.setBounds(1, 370, 200, 150);
        add(i4);
        i5.setBounds(200, 370, 300, 150);
        add(i5);
        i6.setBounds(515, 370, 300, 150);
        add(i6);
        i7.setBounds(830, 370, 300, 150);
        add(i7);

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
        String [] fromCities = {"Kathmandu", "Bhadrapur", "Bhairahawa", "Bharatpur", "Biratnagar", "Dhangadhi"};
        String [] toCities = {"Kathmandu", "Bhadrapur", "Bhairahawa", "Bharatpur", "Biratnagar", "Dhangadhi"};
        String [] nationality = {"Nepal", "China", "India"};

        JComboBox <String> comboBox1= new JComboBox < > (fromCities);
        comboBox1.setBounds(1, 300, 100, 20);
        add(comboBox1);

        JComboBox <String> comboBox2= new JComboBox < > (toCities);
        comboBox2.setBounds(101, 300, 100, 20);
        add(comboBox2);

        JComboBox <String> comboBox3= new JComboBox < > (nationality);
        comboBox3.setBounds(201, 300, 100, 20);
        add(comboBox3);

    }

    // to change images by clicking on the radio buttons
    public void itemStateChanged(ItemEvent e)
    {
        if (r1.isSelected())
        {
            i1.setIcon(new ImageIcon("1.jpg"));
        }
        else if (r2.isSelected())
        {
            i1.setIcon(new ImageIcon("2.jpg"));
        }
        else if (r3.isSelected())
        {
            i1.setIcon(new ImageIcon("3.jpg"));
        }
    }

    public static void main(String[] args)
    {
        new h().setVisible(true);
    }
}

