package typeCasting;

public class Bear implements Animal {
    @Override
    public void eat() {
        System.out.println("Meat for the bear");
    }
    public void attack() {
        System.out.println("Hit with pranks");
    }
}