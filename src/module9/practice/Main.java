package module9.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        List<String> names = Arrays.asList("Peter", "Anna", "Mike", "Kseniya");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare (String a, String b) {
                return b.compareTo(a);
//                return a.compareTo(b);
            }
        });
        System.out.println(names);

        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println(names);

        Collections.sort(names, String::compareTo);

        System.out.println(names);

    }
}
