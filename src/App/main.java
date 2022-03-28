package App;
import Gui.gui;

public class main {

    public static void write(String str) {
        System.out.println(str);
    }

    public static void main (String[] args) {
        gui graphics = new gui();
        graphics.render();
    }
}
