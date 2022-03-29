package app;
import java.util.Random;

public class Game {
    public int guessNo = 0;
    public int targetNo;
    Random random;

    public Game() {
        this.random = new Random();
        this.targetNo = this.random.nextInt(8) + 1;
    }

    public String getFeedback(int i) {
        this.guessNo++;
        if(i == this.targetNo)
            return("You're right! Start new game.");
        else if(i < this.targetNo)
            return("The target is higher!");
        else
            return("The target is lower!");
    }

    public void write(String str) {
        System.out.println(str);
    }
}
