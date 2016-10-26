package module10.homework;

public class Task3 {
    public static void main (String[] args) {

        try {
            Object object = null;
            object.hashCode();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException!");
        }
        //NullPointerException!
    }
}
