package module10.homework;

public class Task5 {
    public static void main (String[] args) {

        for (int i = 3; i < 6; i++){
            try {
                myExceptionMethod(i);
            } catch (MyException3 | MyException4 | MyException5 myException) {
                System.out.println(myException.getMessage());
            }
        }
        //System output:
        //MyException3!
        //MyException4!
        //MyException5!
    }

    public static void myExceptionMethod (int exceptionNumber) throws MyException3, MyException4, MyException5 {

        if (exceptionNumber == 3) throw new MyException3("MyException3!");

        if (exceptionNumber == 4) throw new MyException4("MyException4!");

        if (exceptionNumber == 5) throw new MyException5("MyException5!");
    }
}
