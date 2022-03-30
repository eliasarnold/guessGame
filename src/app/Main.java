package app;
import gui.Gui;

import java.util.ArrayList;

public class Main {

    public static void main (String[] args) {
        Game game = new Game();
        Gui graphics = new Gui(game);
        game.setGui(graphics);
        graphics.render();
    }
}
