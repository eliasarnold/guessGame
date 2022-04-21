package threading;

public class Thread2 extends SuperThread{
    public Thread2(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            Receipt.printLine("This is Thread#2: ");
            try {
                Thread2.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}