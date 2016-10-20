package module9.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamExample {

    public static void main (String[] args) {
        List<String> stringsCollection = new ArrayList<>();
        stringsCollection.add("ddd3");
        stringsCollection.add("ddd2");
        stringsCollection.add("ddd1");
        stringsCollection.add("aaa1");
        stringsCollection.add("aaa2");
        stringsCollection.add("aaa3");
        stringsCollection.add("bbb3");
        stringsCollection.add("bbb2");
        stringsCollection.add("bbb1");
        stringsCollection.add("ccc");


        stringsCollection.stream()

                .filter( s -> s.length() == 4)
                .sorted((a, b) -> a.compareTo(b))
//                .map(s -> s.toUpperCase())
                //.anyMatch(s -> s.contains("aaa"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "desc1"));
        personList.add(new Person(2, "desc2"));
        personList.add(new Person(3, "desc3"));
        personList.stream()
                .filter(person -> person.getPersonId() > 2)
                .forEach(System.out::println);
    }
}
