package blocksatz;
import java.util.*;
import static java.lang.Math.floor;

/*
* Diese Aufgabe wurde beim Assessment der ELCA als erster Task gestellt. Die zweite Aufgabe thematisierte die Verwendung eines Interface. Gegeben war ein SWITCH-Statement, das je nach Klasse die gleiche
* Methode unterschiedlich aurufte (K1.method(), K2.method(), etc.). Das Ziel war, dass alle Klassen ein gemeinsames Interface verwenden, welches dann das SWITCH-Statement überflüssig macht.
* */

public class Main {

    public static void main(String[] args) {
        String in_text = "asd tht z asdfgh jrt asd drfs dfgrts";
        List<String> in_words = new ArrayList<String>(Arrays.asList(in_text.split(" ")));
        String out_text = "";

        while (!in_words.isEmpty()) {
            List<String> line = new ArrayList<String>();
            int linelength = 0;
            while (!in_words.isEmpty() && in_words.get(0).length() + 1 + linelength < 20) {
                line.add(in_words.get(0));
                linelength += in_words.remove(0).length() + 1;
            }

            int whitespaces = Math.max(1, (int) floor((20 - linelength) / line.size()));
            Iterator<String> it = line.iterator();
            while (it.hasNext()) {
                out_text += it.next();
                out_text += " ".repeat(whitespaces);
            }
            out_text += "\n";
        }
        System.out.println(out_text);
    }
}
