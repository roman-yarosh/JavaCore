package module10.homework;

public class Task1 {
    public static void main (String[] args) {
        try {
            throw new Exception("Thrown exception!");
        } catch (Exception e) {
            System.out.println("Catch block! Exception message: " + e.getMessage());
        } finally {
            System.out.println("Finally block!");
        }
        //Catch block! Exception message: Thrown exception!
        //Finally block!
    }
}
