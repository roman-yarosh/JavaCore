package module8.practice;

public class Main {

    public static void main (String[] args) {
        try {
            int x = 0;
            int y = 5 / x;
        } catch (Exception e) {
            System.out.println("Exception");
        }

        System.out.println("finished");


    }
}
