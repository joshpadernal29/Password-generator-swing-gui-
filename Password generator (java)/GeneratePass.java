import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GeneratePass implements ActionListener
{
    // gui components
    JFrame frame;
    JTextField txtField;
    JPanel txtPanel,btPanel;
    JButton generatePass;

    // main functions var
    String numLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
    int passLength = 8;
    StringBuilder randString = new StringBuilder();

    // random obj
    Random rand = new Random();

    // constructor
    public GeneratePass()
    {
        // gui frame
        frame = new JFrame("Password Generator");
       
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        // textfield
        txtField = new JTextField();
        txtField.setEditable(false);
        txtField.setPreferredSize(new Dimension(150,30));
        txtField.setFont(new Font("Arial", Font.BOLD,16));
        txtField.setHorizontalAlignment(JTextField.CENTER);
        txtField.setBorder(new LineBorder(Color.black));

        // textPanel
        txtPanel = new JPanel();
        txtPanel.setLayout(new FlowLayout());
        txtPanel.add(txtField);

        // button for generating password
        generatePass = new JButton("Generate");
        generatePass.setBounds(20, 20, 50, 50);
        generatePass.setPreferredSize(new Dimension(100,50));
        generatePass.addActionListener(this); // acction listenr for clicking
        generatePass.setBorder(new LineBorder(Color.black, 1));

        // jbutton Panel
        btPanel = new JPanel(new FlowLayout());
        btPanel.add(generatePass);
        
        

        // add components to frame
        frame.add(btPanel, BorderLayout.SOUTH);
        frame.add(txtPanel, BorderLayout.NORTH);
        frame.setVisible(true);
    }

    
    /* 
    // main method test
    public static void main(String[] args) 
    {
        // main method here...    
        GeneratePass app = new GeneratePass();
    }
    */

    // button click
    @Override
    public void actionPerformed(ActionEvent e) 
    {   
        // add random string logic here...
        randString.setLength(0); // reset random password
        if (e.getSource() == generatePass) {
            for (int i = 0; i < passLength;i++) {
                char characters = numLetters.charAt(rand.nextInt(numLetters.length())); // generate random index to get character
                randString.append(characters); // append characters 
            }
            String randomPassword = randString.toString(); // convert to string
            txtField.setText(randomPassword); // output random password in the textfield
        }
    }
    
}
