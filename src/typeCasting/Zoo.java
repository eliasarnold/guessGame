package typeCasting;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        Bear a1 = new Bear();
        Elephant a2 = new Elephant();
        BrownBear a3 = new BrownBear();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(a1);
        animals.add(a2);

        animals.forEach(x -> {
            x.eat();
            if(x instanceof Bear)
                ((Bear)x).attack();
        });

        System.out.println("OK");
    }

}
