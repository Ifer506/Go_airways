import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlightDetails extends JFrame implements ActionListener {
    String[] array = {"10:01", "10:10", "01:01"};
    int i=1;
    String [] cities = {"Kathmandu", "Bhadrapur", "Bhairahawa", "Bharatpur", "Biratnagar", "Dhangadhi"};
    String [] travellers = {"1","2","3","4","5"};
    JComboBox <String> fBox = new JComboBox < > (cities);
    JComboBox <String> toBox = new JComboBox < > (cities);
    JComboBox <String> tBox = new JComboBox < > (travellers);

    // Resizing and initializing images
    ImageIcon icon = new ImageIcon("search.png");

    ImageIcon img = new ImageIcon("airplane.png");
    Image scaleImage0 = img.getImage().getScaledInstance(2500,2500,Image.SCALE_DEFAULT);

    JButton back = new JButton("←");
    JButton search = new JButton("SEARCH");
    JButton left = new JButton("‹");
    JButton right = new JButton("›");
    JButton ticket = new JButton("");
    JButton flight = new JButton("");
    JButton flight0 = new JButton("");

    JLabel GA = new JLabel("Go Airways");
    JLabel from0 = new JLabel("From");
    JLabel to0 = new JLabel("To");
    JLabel from = new JLabel("");
    JLabel to = new JLabel("");
    JLabel depDate = new JLabel("Dep Date             -          On Way");
    JLabel traveller = new JLabel("Traveller");
    JLabel noFlights = new JLabel("");
    JLabel flightNo = new JLabel("Flight Number");
    JLabel depTime = new JLabel("Departure Time");
    JLabel arrTime = new JLabel("Arrival Time");
    JLabel duration = new JLabel("Duration");
    JLabel chFare = new JLabel("Choose Fare");
    JLabel FN = new JLabel("");
    JLabel DT = new JLabel("");
    JLabel AT = new JLabel("");
    JLabel D = new JLabel("");
    JLabel error = new JLabel("");
    String weight = "15";
    String time = "10:10";
    JLabel bagg = new JLabel("<html>Max. Baggage:-15 <br> Time:- 10:10</html>");
    JLabel haCarry = new JLabel("Hand Carry");
    JLabel _class = new JLabel("A Class");

    // JTextField fBox = new JTextField();
    // JTextField toBox = new JTextField();
    JTextField ddBox = new JTextField();
    JTextField dBox = new JTextField();
    // JTextField tBox = new JTextField();

    public FlightDetails(){
        // setIconImage(scaleImage);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(0,0,150));
        setLayout(null);
        setIconImage(scaleImage0);

        back.addActionListener(this);
        search.addActionListener(this);
        left.addActionListener(this);
        right.addActionListener(this);
        ticket.addActionListener(this);

        GA.setFont(new Font("Times",Font.BOLD, 30));
        GA.setForeground(new Color(0,200,200));
        from0.setFont(new Font("Times",Font.BOLD, 20));
        from0.setForeground(new Color(0,200,200));
        to0.setFont(new Font("Times",Font.BOLD, 20));
        to0.setForeground(new Color(0,200,200));
        depDate.setFont(new Font("Times",Font.BOLD, 20));
        depDate.setForeground(new Color(0,200,200));
        traveller.setFont(new Font("Times",Font.BOLD, 20));
        traveller.setForeground(new Color(0,200,200));
        fBox.setFont(new Font("Times",Font.PLAIN, 20));
        fBox.setForeground(new Color(0, 163, 108));
        fBox.setBackground(new Color(159,226,191));
        toBox.setFont(new Font("Times",Font.PLAIN, 20));
        toBox.setForeground(new Color(0, 163, 108));
        toBox.setBackground(new Color(159,226,191));
        ddBox.setFont(new Font("Times",Font.PLAIN, 20));
        ddBox.setForeground(new Color(0, 163, 108));
        ddBox.setBackground(new Color(159,226,191));
        dBox.setFont(new Font("Times",Font.PLAIN, 20));
        dBox.setForeground(new Color(0, 163, 108));
        dBox.setBackground(new Color(159,226,191));
        tBox.setFont(new Font("Times",Font.PLAIN, 20));
        tBox.setForeground(new Color(0, 163, 108));
        tBox.setBackground(new Color(159,226,191));
        from.setFont(new Font("Times",Font.BOLD, 20));
        from.setForeground(new Color(0,200,200));
        noFlights.setFont(new Font("Times",Font.BOLD, 20));
        noFlights.setForeground(new Color(0,200,200));
        to.setFont(new Font("Times",Font.BOLD, 20));
        to.setForeground(new Color(0,200,200));
        left.setFont(new Font("Times",Font.BOLD, 50));
        left.setForeground(new Color(0,128,128));
        flight.setFont(new Font("Times",Font.BOLD, 20));
        flight.setForeground(new Color(0,128,128));
        flight0.setFont(new Font("Times",Font.BOLD, 20));
        flight0.setForeground(new Color(0,128,128));
        right.setFont(new Font("Times",Font.BOLD, 50));
        right.setForeground(new Color(0,200,200));
        flightNo.setFont(new Font("Times",Font.BOLD, 20));
        flightNo.setForeground(new Color(0,200,200));
        depTime.setFont(new Font("Times",Font.BOLD, 20));
        depTime.setForeground(new Color(0,200,200));
        arrTime.setFont(new Font("Times",Font.BOLD, 20));
        arrTime.setForeground(new Color(0,200,200));
        duration.setFont(new Font("Times",Font.BOLD, 20));
        duration.setForeground(new Color(0,200,200));
        chFare.setFont(new Font("Times",Font.BOLD, 20));
        chFare.setForeground(new Color(0,200,200));
        FN.setFont(new Font("Times",Font.PLAIN, 20));
        FN.setForeground(Color.white);
        DT.setFont(new Font("Times",Font.PLAIN, 20));
        DT.setForeground(Color.white);
        AT.setFont(new Font("Times",Font.PLAIN, 20));
        AT.setForeground(Color.white);
        D.setFont(new Font("Times",Font.PLAIN, 20));
        D.setForeground(Color.white);
        ticket.setFont(new Font("Times",Font.PLAIN, 20));
        ticket.setForeground(Color.white);
        error.setFont(new Font("Times",Font.BOLD, 10));
        error.setForeground(Color.red);
        
        back.setForeground(new Color(128,0,0));
        back.setBackground(new Color(255, 229, 180));
        search.setForeground(new Color(128,0,0));
        search.setBackground(new Color(255, 229, 180));
        left.setForeground(new Color(128,0,0));
        left.setBackground(new Color(255, 229, 180));
        right.setForeground(new Color(128,0,0));
        right.setBackground(new Color(255, 229, 180));
        ticket.setForeground(new Color(128,0,0));
        ticket.setBackground(new Color(255, 229, 180));
        flight.setForeground(new Color(128,0,0));
        flight.setBackground(new Color(255, 229, 180));
        flight0.setForeground(new Color(128,0,0));
        flight0.setBackground(new Color(255, 229, 180));


        left.setFocusable(false);
        right.setFocusable(false);
        ticket.setFocusable(false);
        flight.setFocusable(false);
        flight0.setFocusable(false);
        search.setFocusable(false);
        back.setFocusable(false);

        left.setBorder(BorderFactory.createEtchedBorder());
        right.setBorder(BorderFactory.createEtchedBorder());
        ticket.setBorder(BorderFactory.createEtchedBorder());
        search.setBorder(BorderFactory.createEtchedBorder());

        back.setBounds(10,10,45,20);
        GA.setBounds(100,20,200,45);

        from0.setBounds(150,150,100,25);
        to0.setBounds(350,150,50,25);
        depDate.setBounds(550,150,300,25);
        traveller.setBounds(950,150,100,25);

        fBox.setBounds(150,180,150,25);
        toBox.setBounds(350,180,150,25);
        ddBox.setBounds(550,180,150,25);
        dBox.setBounds(750,180,150,25);
        tBox.setBounds(950,180,150,25);
        search.setBounds(590,205,60,25);
        error.setBounds(560,232,140,20);

        from.setBounds(350,300,150,25);
        noFlights.setBounds(550,300,150,25);
        to.setBounds(790,300,150,25);

        left.setBounds(350,350,80,80);
        flight.setBounds(450,360,150,50);
        flight0.setBounds(610,360,150,50);
        right.setBounds(785,350,80,80);

        flightNo.setBounds(210,500,150,25);
        depTime.setBounds(400,500,150,25);
        arrTime.setBounds(600,500,150,25);
        duration.setBounds(780,500,150,25);
        chFare.setBounds(910,500,150,25);

        FN.setBounds(220,550,80,20);
        DT.setBounds(410,550,80,20);
        AT.setBounds(610,550,80,20);
        D.setBounds(790,550,80,20);
        ticket.setBounds(920,550,80,20);

        add(GA);
        add(back);
        add(from);
        add(to);
        add(from0);
        add(to0);
        add(depDate);
        add(traveller);
        add(fBox);
        add(ddBox);
        add(tBox);
        add(toBox);
        add(dBox);
        add(flight);
        add(left);
        add(noFlights);
        add(flight0);
        add(depTime);
        add(flightNo);
        add(right);
        add(arrTime);
        add(duration);
        add(chFare);
        add(FN);
        add(DT);
        add(AT);
        add(D);
        add(ticket);
        add(search);
        add(error);

        ticket.setVisible(false);
        D.setVisible(false);
        AT.setVisible(false);
        DT.setVisible(false);
        FN.setVisible(false);
        flight0.setVisible(false);
        flight.setVisible(false);
        noFlights.setVisible(false);
        from.setVisible(false);
        to.setVisible(false);
        left.setVisible(false);
        right.setVisible(false);
        flightNo.setVisible(false);
        depTime.setVisible(false);
        arrTime.setVisible(false);
        duration.setVisible(false);
        chFare.setVisible(false);

        // getSetText gst = new getSetText();
        // System.out.print(gst.getc0());
        // fBox.setText(gst.getc0());
        // toBox.setText(gst.getc1());
        // fBox.setText(gst.getc2());
    }
    public void actionPerformed(ActionEvent a){
        if (a.getSource() == search){
            if (ddBox.getText().equals("") || dBox.getText().equals("")){
                error.setText("(Plese fill all the blank fields)");
            }
            else if(toBox.getSelectedItem().toString()==fBox.getSelectedItem().toString()){
                error.setBounds(525,232,230,20);
                error.setText("(Departure and Arrival places must be different)");
            }
            else{
                error.setVisible(false);
                to.setText(toBox.getSelectedItem().toString());
                from.setText(fBox.getSelectedItem().toString());
                noFlights.setText("10 Flights");
                flight.setText(array[i-1]);
                flight0.setText(array[i]);
                FN.setText("LM10");
                DT.setText("10:01");
                AT.setText("10:10");
                D.setText("09 min");
                ticket.setText("1010");

                ticket.setVisible(true);
                D.setVisible(true);
                AT.setVisible(true);
                DT.setVisible(true);
                FN.setVisible(true);
                flight0.setVisible(true);
                flight.setVisible(true);
                noFlights.setVisible(true);
                from.setVisible(true);
                to.setVisible(true);
                left.setVisible(true);
                right.setVisible(true);
                flightNo.setVisible(true);
                depTime.setVisible(true);
                arrTime.setVisible(true);
                duration.setVisible(true);
                chFare.setVisible(true);
            }
        }
        if (a.getSource() == back){
            // new HomePage().setVisible(true);
            dispose();
        }
        // left and right doesn't work
        if (a.getSource() == right){
            i+=1;
            flight.setText(array[i-1]);
            flight0.setText(array[i]);
        }
        if (a.getSource() == left){
            i-=1;
            flight.setText(array[i-1]);
            flight.setText(array[i]);
        }
        if (a.getSource()==ticket){
            JOptionPane.showMessageDialog(null, bagg,"Information", JOptionPane.DEFAULT_OPTION);
        }
    }
    public static void main(String[] args) {
        new FlightDetails().setVisible(true);
    }
}