package app;

class TestException extends Exception {
    public TestException() {
        super("Das ist die Test-Exception");
    }
}

public class test {
    public static void example() throws TestException {
        // int[] i = {1, 2, 3};
        // System.out.println(i[3]);
        throw new TestException();
    }

    public static void main (String[] args) {
        try {
            example();
        } catch (TestException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("out-of-bounds");
        } finally {
            System.out.print("finally");
        }
    }
}
