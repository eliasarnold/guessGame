package zoo;

public class Cat implements Animal{
    @Override
    public void makeNoise() {
        System.out.println("Meeow");
    }

    public void begForFood() {
        System.out.println("Can I have Food");
    }
}
