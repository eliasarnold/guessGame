package Gui;
import App.main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui{
    int guessNrInt = 0;
    JLabel hintText = new JLabel("Guess a number between 0 and 10: ");
    JLabel feedback = new JLabel();
    JLabel bestScore = new JLabel("Best Score: XX");
    JLabel guessNr = new JLabel("Guess nr.: 0");
    JLabel gameNr = new JLabel("Game nr.: XX");
    JTextField input = new JTextField(1);
    JButton button = new JButton("Send");

    public void setFeedback(String str) {
        feedback.setText(str);
    }

    public void updateGuessNr() {
        guessNrInt++;
        guessNr.setText("Guess nr.: " + guessNrInt);
    }

    public void render(){

        // make JFrame
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);

        // make top panel
        JPanel top = new JPanel();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                main.write(input.getText());
                setFeedback("Hoooodie");
                updateGuessNr();
            }
        });

        top.add(hintText);
        top.add(input);
        top.add(button);

        // make middle panel
        JPanel middle = new JPanel();

        middle.add(feedback);

        // make bottom panel
        JPanel bottom = new JPanel();

        bottom.add(bestScore);
        bottom.add(guessNr);
        bottom.add(gameNr);

        // distribute Content
        frame.getContentPane().add(BorderLayout.NORTH, top);
        frame.getContentPane().add(BorderLayout.CENTER, middle);
        frame.getContentPane().add(BorderLayout.SOUTH, bottom);

        frame.setVisible(true);
    }
}