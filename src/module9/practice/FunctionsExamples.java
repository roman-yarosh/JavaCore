package module9.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionsExamples {
    public static void main (String[] args) {
        Function<String, Integer> stringToInteger1 = s -> Integer.valueOf(s);
        Function<String, Integer> stringToInteger2 = Integer::valueOf;  //Method reference
        System.out.println(stringToInteger1.apply("1234"));
        System.out.println(stringToInteger2.apply("34"));

        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1, "Husband"));
        persons.add(new Person(2, "Software engineer"));
        persons.add(new Person(3, "Dad"));
        persons.add(new Person(4, "Instructor"));
        persons.add(new Person(5, "Hanger"));

        Function<Person, Job> mapPersonToJob1 = new Function<Person, Job>() {
            @Override
            public Job apply (Person person) {
                return new Job(person.getPersonId(), person.getJobDescription());
            }
        };

        Function<Person, Job> mapPersonToJob2 = person -> new Job(person.getPersonId(), person.getJobDescription());

        System.out.println(mapPersonToJob2.apply(persons.get(1)));

        List<Job> jobList = persons.stream()
                .filter(isAdultMale())
                .map(mapPersonToJob2)
                .collect(Collectors.toList());
        System.out.println(jobList);

        //predicate example


        //List<Job> jobs = persons.stream()                .filter()
    }

    static Predicate<Person> isAdultMale() {
        return person -> person.getPersonId() < 4 && !person.getJobDescription().equalsIgnoreCase("Test");
    }
}
