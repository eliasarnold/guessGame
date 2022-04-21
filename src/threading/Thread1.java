package threading;

public class Thread1 extends SuperThread{
    public Thread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            Receipt.printLine("This is Thread#1: ");
            try {
                Thread1.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
