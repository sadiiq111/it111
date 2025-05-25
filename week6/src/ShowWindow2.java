import javax.swing.*;
import java.awt.*;

public class ShowWindow2 {

    public static void main(String[] args) {

        // Declare constants for window size
        final int WINDOW_WIDTH = 450;
        final int WINDOW_HEIGHT = 600;

        // Create a window
        JFrame window = new JFrame();

        // Declare labels and text fields
        JLabel myLabel1, myLabel2;
        JTextField textField1, textField2;

        // Set the title of the window
        window.setTitle("A Simple window");

        // Set the size of the window
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    // set location
        window.setLocation(500, 50);
        // Set background color
        window.getContentPane().setBackground(Color.RED);

        // Turn off the layout manager
        window.setLayout(null);

        // Create first label and set bounds
        myLabel1 = new JLabel("My First Big Label!");
        myLabel1.setFont(new Font("Arial", Font.PLAIN, 22));
        myLabel1.setBounds(50, 50, 300, 30);
        window.add(myLabel1);

        // Create first text field and set bounds
        textField1 = new JTextField(30);
        textField1.setBounds(50, 90, 300, 30);
        window.add(textField1);

        // Create second label and set bounds
        myLabel2 = new JLabel("My Second Big Label!!!");
        myLabel2.setFont(new Font("Arial", Font.BOLD, 18));
    
        myLabel2.setBounds(50, 140, 300, 30);
        window.add(myLabel2);


        // Create second text field and set bounds
        textField2 = new JTextField(30);
        textField2.setBounds(50, 180, 300, 30);
        window.add(textField2);

        // Close the application when the window is closed
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the window visible
        window.setVisible(true);
    }
}