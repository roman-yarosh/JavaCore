package module10.homework;

public class MyException1 extends Exception {

    private String message;

    public MyException1 (String message) {
        super(message);
        this.message = message;
    }

    public void printMyExceptionMessage() {
        System.out.println("My method: " + message);
    }
}
