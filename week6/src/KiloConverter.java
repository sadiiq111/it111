import javax.swing.*;

public class KiloConverter extends JFrame {
   // public static void main(String [] args){

    JPanel panel;

    JLabel messageLabel;
    JTextField KiloTextField;
    JButton calcButton;
    final int WINDOW_WIDTH = 350;
    final int WINDOW_HEIGHT = 450;

    // always be aware of the colors that Intellij is using
    // create a constructor which is a spacial to initialize our Objects

    public KiloConverter() {
        setTitle("Kilometer Converter");

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buildPanel();
        add(panel);
        setVisible(true);


    }
    public void buildPanel() {
        messageLabel = new JLabel("enter a distance in kilometers");
        // text, button, panel
        KiloTextField = new JTextField(18);
        calcButton = new JButton("calculate");
        // we are not have to above three components onto the jpanel
panel = new JPanel();

        panel.add(messageLabel);
        panel.add(KiloTextField);
        panel.add(calcButton);

        // we have to add our main method!!!
    }
    public static void main(String[] args){
        new KiloConverter();

    }
}
