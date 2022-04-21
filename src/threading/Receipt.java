package threading;

public class Receipt {
    static long x;
    private static StringBuilder sb = new StringBuilder("---- Hi, I'm the StringBuilder ----");

    public static synchronized void printLine(String prefix) {
        x += 5;
        x -= 4;
        sb.append("\n" + prefix + "The value of x is: " + x);
    }

    public static void main (String[] args) throws InterruptedException {
        Thread thread1 = new Thread1("Felix");
        SuperThread thread2 = new Thread2("Hans");

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(sb.toString());
    }
}
