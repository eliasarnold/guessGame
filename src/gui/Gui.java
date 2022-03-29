package gui;
import app.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Objects;

public class Gui{
    boolean restartReady = false;
    Game game;
    JLabel hintText = new JLabel("Guess a number between 0 and 10: ");
    JLabel feedback = new JLabel();
    JLabel bestScore = new JLabel("Best Score: XX");
    JLabel guessNr = new JLabel("Guess nr.: 0");
    JLabel gameNr = new JLabel("Game nr.: XX");
    JTextField input = new JTextField(1);
    JButton button = new JButton("Send");
    JButton restart = new JButton("restart");

    public Gui (Game game) {
        this.game = game;
    }

    public void setFeedback(String str) {
        feedback.setText(str);
    }

    public void updateGuessNr() {
        guessNr.setText("Guess nr.: " + this.game.guessNo);
    }

    public void toggleRestartButton() {
        this.restartReady = !this.restartReady;
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
                int inputNo = Integer.parseInt(input.getText());
                setFeedback(game.getFeedback(inputNo));
                updateGuessNr();
                if(restartReady) {
                    button.setEnabled(false);
                    restart.setEnabled(true);
                }
            }
        });

        restart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                restartReady = false;
                button.setEnabled(true);
                restart.setEnabled(false);
                Game new_game = new Game();
                Main.pushOldGame(game);
                game = new_game;
                game.setGui(Gui.this);
            }
        });

        input.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char c = e.getKeyChar();
                if(Objects.equals(input.getText(), ""))
                    input.setEditable((c >= '0') && (c <= '9'));
                else
                    input.setEditable(c == KeyEvent.VK_BACK_SPACE);
            }
        });

        restart.setEnabled(false);
        top.add(hintText);
        top.add(input);
        top.add(button);
        top.add(restart);

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