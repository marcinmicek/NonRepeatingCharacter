package pl.marcinmicek;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class NonRepeatingCharacter extends JFrame {

    private JTextArea inputTextArea;
    private JButton findTheCharacterButton;
    private JTextField resultTextField;
    private JButton clearButton;
    private JButton exitButton;
    private JLabel inputLabel;
    private JPanel mainPanel;
    private JLabel resultLabel;

    public NonRepeatingCharacter(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // clear the text fields
                inputTextArea.setText("");
                resultTextField.setText("");
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // exit from application
                System.exit(0);
            }
        });
        findTheCharacterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultTextField.setText(SearchingChallenge(inputTextArea.getText()));
            }
        });
    }

    public static String SearchingChallenge(String str) {
        // code goes here
        String input = str;

        for (char i : str.toCharArray()) {
            if (str.indexOf(i) == str.lastIndexOf(i)) {
                str  = Character.toString(i);
                break;
            }
        }

        // if the non-repeating character is a space return string "space"
        if (str.equals(" ")) {
          str = "\"space\"";
        } else if (str.equals(input)) {
            str = "none (all characters are repeating)";
        }

        return str;
    }

    public static void main (String[] args) {

//        System.out.println("Input the string to test:");
//        Scanner s = new Scanner(System.in);
//        System.out.println("The first non-repeating character in the input string is: " + SearchingChallenge(s.nextLine()));

        JFrame frame = new NonRepeatingCharacter("Searching for the first non-repeating character in a string");
        frame.setVisible(true);
        frame.setSize(700,300);
    }

}
