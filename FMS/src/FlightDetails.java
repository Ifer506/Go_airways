import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlightDetails extends JFrame implements ActionListener {
    String[] array = {"10:01", "10:10", "01:01"};
    int i=1;

    // Resizing and initializing images
    ImageIcon icon = new ImageIcon("search.png");
    Image scaleImage = icon.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);

    JButton back = new JButton("←");
    JButton search = new JButton(new ImageIcon(scaleImage));
    JButton left = new JButton("‹");
    JButton right = new JButton("›");
    JButton ticket = new JButton("---");
    JButton flight = new JButton("---");
    JButton flight0 = new JButton("---");

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
    JLabel FN = new JLabel("---");
    JLabel DT = new JLabel("---");
    JLabel AT = new JLabel("---");
    JLabel D = new JLabel("---");
    JLabel error = new JLabel("");
    JLabel bagg = new JLabel("Baggage");
    JLabel haCarry = new JLabel("Hand Carry");
    JLabel _class = new JLabel("A Class");

    JTextField fBox = new JTextField();
    JTextField toBox = new JTextField();
    JTextField ddBox = new JTextField();
    JTextField dBox = new JTextField();
    JTextField tBox = new JTextField();

    public FlightDetails(){
        // setIconImage(scaleImage);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        back.addActionListener(this);
        search.addActionListener(this);
        left.addActionListener(this);
        right.addActionListener(this);
        ticket.addActionListener(this);

        GA.setFont(new Font("Times",Font.BOLD, 30));
        from0.setFont(new Font("Times",Font.BOLD, 20));
        to0.setFont(new Font("Times",Font.BOLD, 20));
        depDate.setFont(new Font("Times",Font.BOLD, 20));
        traveller.setFont(new Font("Times",Font.BOLD, 20));
        fBox.setFont(new Font("Times",Font.PLAIN, 20));
        toBox.setFont(new Font("Times",Font.PLAIN, 20));
        ddBox.setFont(new Font("Times",Font.PLAIN, 20));
        dBox.setFont(new Font("Times",Font.PLAIN, 20));
        tBox.setFont(new Font("Times",Font.PLAIN, 20));
        from.setFont(new Font("Times",Font.BOLD, 20));
        noFlights.setFont(new Font("Times",Font.BOLD, 20));
        to.setFont(new Font("Times",Font.BOLD, 20));
        left.setFont(new Font("Times",Font.BOLD, 50));
        flight.setFont(new Font("Times",Font.BOLD, 20));
        flight0.setFont(new Font("Times",Font.BOLD, 20));
        right.setFont(new Font("Times",Font.BOLD, 50));
        flightNo.setFont(new Font("Times",Font.BOLD, 20));
        depTime.setFont(new Font("Times",Font.BOLD, 20));
        arrTime.setFont(new Font("Times",Font.BOLD, 20));
        duration.setFont(new Font("Times",Font.BOLD, 20));
        chFare.setFont(new Font("Times",Font.BOLD, 20));
        FN.setFont(new Font("Times",Font.PLAIN, 20));
        DT.setFont(new Font("Times",Font.PLAIN, 20));
        AT.setFont(new Font("Times",Font.PLAIN, 20));
        D.setFont(new Font("Times",Font.PLAIN, 20));
        ticket.setFont(new Font("Times",Font.PLAIN, 20));
        error.setFont(new Font("Times",Font.BOLD, 10));
        error.setForeground(Color.red);

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
        search.setBounds(600,205,50,25);
        error.setBounds(580,232,100,20);

        from.setBounds(350,300,150,25);
        noFlights.setBounds(550,300,150,25);
        to.setBounds(750,300,150,25);

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
    }
    public void actionPerformed(ActionEvent a){
        if (a.getSource() == search){
            System.out.print(fBox.getText());
            if (tBox.getText()=="ktm"){
                error.setText("(Plese fill all the text fields)");
            }
            else{
                to.setText(toBox.getText());
                from.setText(fBox.getText());
                noFlights.setText("10 Flights");
                flight.setText(array[i-1]);
                flight0.setText(array[i]);
                FN.setText("LM10");
                DT.setText("10:01");
                AT.setText("10:10");
                D.setText("09 min");
                ticket.setText("1010");
            }
        }
        if (a.getSource() == back){
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
            JOptionPane.showMessageDialog(null, bagg,"More Info", JOptionPane.DEFAULT_OPTION);
        }
    }
    public static void main(String[] args) {
        new FlightDetails().setVisible(true);
    }
}

