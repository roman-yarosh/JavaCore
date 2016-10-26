package module10.homework;

public class Task4 {
    public static void main (String[] args){

        try {
            g();
        } catch (MyException1 myException1) {
            System.out.println("Catch MyException1!");
        }

        try {
            f();
        } catch (MyException2 myException2) {
            System.out.println("Catch MyException2!");
        }
        //Catch MyException1!
        //Catch MyException2!
    }

    public static void f () throws MyException2 {
        try {
            g();
        } catch (MyException1 myException1) {
            throw new MyException2("MyException2 from method f() in catch block!");
        }
    }

    public static void g () throws MyException1 {
        throw new MyException1("MyException1 from method g()!");
    }
}
