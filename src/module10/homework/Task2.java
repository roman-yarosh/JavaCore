package module10.homework;

public class Task2 {
    public static void main (String[] args) {
        try {
            throw new MyException1("Throw MyException1!");
        } catch (MyException1 myException1) {
            myException1.printMyExceptionMessage();
        }
        //My method: Throw MyException1!
    }
}
