package app;
import gui.Gui;

public class Main {

    public static void main (String[] args) {
        Game game = new Game();
        Gui graphics = new Gui(game);
        game.setGui(graphics);
        graphics.render();
    }
}
