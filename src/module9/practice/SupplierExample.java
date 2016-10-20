package module9.practice;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main (String[] args) {
        /*Supplier<Person> personSupplier = new Supplier<Person>() {
            @Override
            public Person get () {
                return new Person();
            }
        };
*/
        Supplier<Person> supplier = () -> new Person();
       // Person person = personSupplier.get();
        Person person;
        person = supplier.get();

        display(() -> 100);
    }

    public static void display (Supplier<Integer> arg) {
        System.out.println(arg.get());
    }
}
