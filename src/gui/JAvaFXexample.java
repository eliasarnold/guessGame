package gui;
import javax.swing.*;
import java.awt.*;

class JAvaFXexample{
    public static void main(String args[]){

        // make JFrame
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);

        // make top panel
        JPanel top = new JPanel();
        JLabel label = new JLabel("Guess a number between 0 and 10: ");
        JTextField text = new JTextField(1);
        JButton button1 = new JButton("Send");

        top.add(label);
        top.add(text);
        top.add(button1);

        // make middle panel
        JPanel middle = new JPanel();
        JLabel feedback = new JLabel("OUTPUT HERE");

        middle.add(feedback);

        // make bottom panel
        JPanel bottom = new JPanel();
        JLabel label1 = new JLabel("Best Score: XX");
        JLabel label2 = new JLabel("Guess nr.: XX");
        JLabel label3 = new JLabel("Game nr.: XX");

        bottom.add(label1);
        bottom.add(label2);
        bottom.add(label3);

        // distribute Content
        frame.getContentPane().add(BorderLayout.NORTH, top);
        frame.getContentPane().add(BorderLayout.CENTER, middle);
        frame.getContentPane().add(BorderLayout.SOUTH, bottom);

        frame.setVisible(true);
    }
}