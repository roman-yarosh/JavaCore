package module9.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main (String[] args) {
//        Consumer<String> consumer = s -> printNames(s);
//        Consumer<String> consumer = System.out::println;
        Consumer<String> consumer = s -> System.out.println(s + " test");

        consumer.accept("Jerry");

        List<String> list = new ArrayList<>();
        list.add("Test1");
        list.add("Test2");
        list.add("Test3");

        list.stream().forEach(System.out::println);
        


    }

    public static void printNames (String name) {
        System.out.println(name);
    }
}
