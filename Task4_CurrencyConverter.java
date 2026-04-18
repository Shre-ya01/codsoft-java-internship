import javax.swing.*;
import java.awt.event.*;

public class SimpleGUI {

    public static void main(String[] args) {

        // Create window
        JFrame f = new JFrame("Currency Converter");

        // Input field
        JTextField t = new JTextField();
        t.setBounds(100, 30, 100, 30);

        // Button
        JButton b = new JButton("Convert");
        b.setBounds(100, 80, 100, 30);

        // Label for result
        JLabel l = new JLabel("Result: ");
        l.setBounds(100, 130, 200, 30);

        // Button click action
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double amount = Double.parseDouble(t.getText());
                    double result = amount / 83.0; // INR to USD
                    l.setText("Result: $" + result);
                } catch (Exception ex) {
                    l.setText("Enter valid number!");
                }
            }
        });

        // Add components
        f.add(t);
        f.add(b);
        f.add(l);

        // Frame settings
        f.setSize(300, 250);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
