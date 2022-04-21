package zoo;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.makeNoise();

        cat = new Tiger();

        cat.makeNoise();
    }
}
