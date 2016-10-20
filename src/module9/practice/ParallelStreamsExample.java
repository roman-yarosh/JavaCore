package module9.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class ParallelStreamsExample {
    public static void main (String[] args) {
        int max = 1000000;
        List<String> values = new ArrayList<>(max);

        for (int i = 0; i < max; i++){
            values.add(UUID.randomUUID().toString());
        }

        long t0 = System.nanoTime();
        long count = values.stream().sorted().count();
        System.out.println(Thread.activeCount());
        System.out.println(count);
        long t1 = System.nanoTime();
        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("Sequential sort took: %d ms", millis));


        t0 = System.nanoTime();
        System.out.println(Thread.activeCount());
        count = values.parallelStream().sorted().count();
        System.out.println(Thread.activeCount());
        System.out.println(count);
        System.out.println(Thread.activeCount());
        t1 = System.nanoTime();
        millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("Parallel sort took: %d ms", millis));
    }
}
