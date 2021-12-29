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

        mb = new JMenuBar();
        add(mb);

        mi = new JMenuItem();
        add(mi);

        fi = new JMenu("Flight Information");
        fr = new JMenu("Flight Routes");
        c19 = new JMenu("Covid - 19");
        au = new JMenu("About Us");

        mb.add(fi);
        mb.add(fr);
        mb.add(c19);
        mb.add(au);

        aa = new JMenuItem("Flight Status");
        ab = new JMenuItem("Ticket Status");

        fi.add(aa);
        fi.add(ab);

        setJMenuBar(mb);

        a.setBounds(0, 0, 156, 40);
        a.setFont(new Font("serif", Font.BOLD, 30));
        b.setBounds(0, 265, 156, 40);
        b.setFont(new Font("serif", Font.BOLD, 20));
        c.setBounds(101, 265, 156, 40);
        c.setFont(new Font("serif", Font.BOLD, 20));
        d.setBounds(201, 265, 156, 40);
        d.setFont(new Font("serif", Font.BOLD, 20));
        e.setBounds(1, 515, 141, 40);
        e.setFont(new Font("serif", Font.BOLD, 20));
        f.setBounds(201, 515, 117, 40);
        f.setFont(new Font("serif", Font.BOLD, 20));
        g.setBounds(401, 515, 94, 40);
        g.setFont(new Font("serif", Font.BOLD, 20));
        h.setBounds(601, 515, 82, 40);
        h.setFont(new Font("serif", Font.BOLD, 20));
        i.setBounds(301, 300, 110, 20);
        j.setBounds(1, 540, 82, 40);
        j.setFont(new Font("serif", Font.PLAIN, 15));
        k.setBounds(1, 570, 82, 40);
        k.setFont(new Font("serif", Font.PLAIN, 15));
        l.setBounds(1, 600, 82, 40);
        l.setFont(new Font("serif", Font.PLAIN, 15));
        m.setBounds(401, 550, 120, 140);
        m.setFont(new Font("serif", Font.PLAIN, 15));

        i1.setBounds(100, 50, 550, 200);
        add(i1);
        i4.setBounds(1, 340, 200, 170);
        add(i4);
        i5.setBounds(200, 340, 300, 170);
        add(i5);
        i6.setBounds(515, 340, 300, 170);
        add(i6);
        i7.setBounds(830, 340, 300, 170);
        add(i7);


        r1.setBounds(350, 240, 20, 13);
        r1.setSelected(true);
        r1.addItemListener(this);
        add(r1);
        r2.setBounds(370, 240, 20, 13);
        r2.addItemListener(this);
        add(r2);
        r3.setBounds(390, 240, 20, 13);
        r3.addItemListener(this);
        add(r3);

        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        add(a);
        add(b);
        add(c);
        add(d);
        add(e);
        add(f);
        add(g);
        add(h);
        add(i);
        add(j);
        add(k);
        add(l);
        add(m);

        // adding a comboBox
        String [] fromCities = {"Kathmandu", "Bhadrapur", "Bhairahawa", "Bharatpur", "Biratnagar", "Dhangadhi"};
        String [] toCities = {"Kathmandu", "Bhadrapur", "Bhairahawa", "Bharatpur", "Biratnagar", "Dhangadhi"};
        String [] nationality = {"Nepal", "China", "India"};

        JComboBox <String> comboBox1= new JComboBox < > (fromCities);
        comboBox1.setBounds(1, 300, 100, 20);

        JComboBox <String> comboBox2= new JComboBox < > (toCities);
        comboBox2.setBounds(101, 300, 100, 20);

        JComboBox <String> comboBox3= new JComboBox < > (nationality);
        comboBox3.setBounds(201, 300, 100, 20);

        add(comboBox1);
        add(comboBox2);
        add(comboBox3);
    }

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

