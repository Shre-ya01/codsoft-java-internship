import javax.swing.*;
import java.awt.event.*;

public class StudentGUI {

    public static void main(String[] args) {

        // Create frame
        JFrame f = new JFrame("Student Management System");

        // Labels
        JLabel l1 = new JLabel("Name:");
        l1.setBounds(30, 30, 100, 30);

        JLabel l2 = new JLabel("Roll No:");
        l2.setBounds(30, 70, 100, 30);

        // Text fields
        JTextField t1 = new JTextField();
        t1.setBounds(120, 30, 120, 30);

        JTextField t2 = new JTextField();
        t2.setBounds(120, 70, 120, 30);

        // Button
        JButton b = new JButton("Add Student");
        b.setBounds(80, 120, 150, 30);

        // Output label
        JLabel result = new JLabel("Student Details:");
        result.setBounds(30, 170, 300, 30);

        // Button action
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = t1.getText();
                String roll = t2.getText();

                if(name.isEmpty() || roll.isEmpty()) {
                    result.setText("Please enter all details!");
                } else {
                    result.setText("Name: " + name + " | Roll No: " + roll);
                }
            }
        });

        // Add components
        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(t2);
        f.add(b);
        f.add(result);

        // Frame settings
        f.setSize(350, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}