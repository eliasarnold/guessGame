package zoo;

public class Tiger implements Animal {
    @Override
    public void makeNoise() {
        System.out.println("Grrrrrah");
    }

    public void jumpOnVisitor() {
        System.out.print("Hmmmm tasty visitor");
    }
}
