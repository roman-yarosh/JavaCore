package module7.homework;

import java.util.*;
import java.util.function.UnaryOperator;

public class Main {
    public static void main (String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        List<String> list = new ArrayList<>();

        Set<String> set = new TreeSet<>();
        set.add("aaa");
        set.add("ccc");
        set.add("bbb");

        Set<Integer> set1 = new TreeSet<>();

        set1.add(11);
        set1.add(9);
        set1.add(15);

        System.out.println(set + " " + set1);

        PriorityQueue<Integer> queue1 = new PriorityQueue<>();
        queue1.add(11);
        queue1.add(-11);
        queue1.add(0);
        queue1.add(-3);
        queue1.add(7);
        queue1.add(5);
        queue1.add(-4);
        System.out.println(queue1);
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
        //System.out.println(queue1);



        int a = queue1.element();
        System.out.println("a = " + a);


        list.add("item1");
        list.add("item2");
        list.add("test");


        UnaryOperator<String> operator = new UnaryOperator<String>() {
            @Override
            public String apply (String s) {
                if (s.contains("item")) return "repalced";
                return s;
            }
        };

        list.replaceAll(operator);

        System.out.println(list);

        queue.add("Item 1");
        queue.add("Item 2");
        queue.add("Item 3");

        System.out.println(queue);

        System.out.println(queue.element());
        System.out.println(queue.peek());

        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(queue.offer("Offer"));

        System.out.println(queue);

        System.out.println(queue.remove());

        System.out.println(queue);

        queue.clear();

        System.out.println(queue);
        //System.out.println(queue.element());
        System.out.println(queue.peek());
    }
}
