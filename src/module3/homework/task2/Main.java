package module3.homework.task2;

public class Main {

    public static void main(String[] args) {

        Adder adder = new Adder();

        System.out.println("Method add(1, 2) returns: " + adder.add(1, 2)); //Method add(1, 2) returns: 3
        System.out.println("Method add(2, 3) returns: " + adder.add(2, 3)); //Method add(2, 3) returns: 5

        System.out.println("Method check(1, 2) returns: " + adder.check(1, 2)); //Method check(1, 2) returns: false
        System.out.println("Method check(3, 2) returns: " + adder.check(3, 2)); //Method check(3, 2) returns: true
    }
}
