package module7.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListsTest {

    public static void main(String[] args) {

        List<Integer> integerArrayList = new ArrayList<Integer>();
        List<String> stringArrayList = new ArrayList<String>();
        List<Integer> integerLinkedList = new LinkedList<Integer>();
        List<String> stringLinkedList = new LinkedList<String>();

        long startTime;
        long finishTime;

        System.out.println("System output:\nTest of ArrayList and LinkedList for add method (1000, 10000, 1000000 elements). Time in millis:\n");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            integerArrayList.add(5);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of integerArrayList for add method (1000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            integerLinkedList.add(5);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of integerLinkedList for add method (1000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            stringArrayList.add("Test string!");
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of stringArrayList for add method (1000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            stringLinkedList.add("Test string!");
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of stringLinkedList for add method (1000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        integerArrayList.clear();
        integerLinkedList.clear();
        stringArrayList.clear();
        stringLinkedList.clear();

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            integerArrayList.add(5);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("\nTest of integerArrayList for add method (10000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            integerLinkedList.add(5);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of integerLinkedList for add method (10000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            stringArrayList.add("Test string!");
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of stringArrayList for add method (10000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            stringLinkedList.add("Test string!");
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of stringLinkedList for add method (10000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        integerArrayList.clear();
        integerLinkedList.clear();
        stringArrayList.clear();
        stringLinkedList.clear();

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++){
            integerArrayList.add(5);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("\nTest of integerArrayList for add method (1000000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++){
            integerLinkedList.add(5);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of integerLinkedList for add method (1000000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++){
            stringArrayList.add("Test string!");
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of stringArrayList for add method (1000000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++){
            stringLinkedList.add("Test string!");
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of stringLinkedList for add method (1000000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        /* System output:
        Test of ArrayList and LinkedList for add method (1000, 10000, 1000000 elements). Time in millis:

        Test of integerArrayList for add method (1000 element). Time = 0 (start = 1476040837218, finish = 1476040837218)
        Test of integerLinkedList for add method (1000 element). Time = 0 (start = 1476040837218, finish = 1476040837218)
        Test of stringArrayList for add method (1000 element). Time = 0 (start = 1476040837218, finish = 1476040837218)
        Test of stringLinkedList for add method (1000 element). Time = 0 (start = 1476040837218, finish = 1476040837218)

        Test of integerArrayList for add method (10000 element). Time = 0 (start = 1476040837218, finish = 1476040837218)
        Test of integerLinkedList for add method (10000 element). Time = 16 (start = 1476040837218, finish = 1476040837234)
        Test of stringArrayList for add method (10000 element). Time = 0 (start = 1476040837234, finish = 1476040837234)
        Test of stringLinkedList for add method (10000 element). Time = 0 (start = 1476040837234, finish = 1476040837234)

        Test of integerArrayList for add method (1000000 element). Time = 78 (start = 1476040837234, finish = 1476040837312)
        Test of integerLinkedList for add method (1000000 element). Time = 266 (start = 1476040837312, finish = 1476040837578)
        Test of stringArrayList for add method (1000000 element). Time = 140 (start = 1476040837578, finish = 1476040837718)
        Test of stringLinkedList for add method (1000000 element). Time = 141 (start = 1476040837718, finish = 1476040837859) */

        System.out.println("\nSystem output:\nTest of ArrayList and LinkedList for set method (1000, 10000, 100000 elements). Time in millis:\n");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            integerArrayList.set(i, 5);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of integerArrayList for set method (1000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            integerLinkedList.set(i, 5);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of integerLinkedList for set method (1000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            stringArrayList.set(i, "Test string!");
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of stringArrayList for set method (1000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            stringLinkedList.set(i, "Test string!");
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of stringLinkedList for set method (1000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            integerArrayList.set(i, 5);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("\nTest of integerArrayList for set method (10000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            integerLinkedList.set(i, 5);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of integerLinkedList for set method (10000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            stringArrayList.set(i, "Test string!");
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of stringArrayList for set method (10000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            stringLinkedList.set(i, "Test string!");
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of stringLinkedList for set method (10000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            integerArrayList.set(i, 5);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("\nTest of integerArrayList for set method (100000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            integerLinkedList.set(i, 5);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of integerLinkedList for set method (100000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            stringArrayList.set(i, "Test string!");
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of stringArrayList for set method (100000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            stringLinkedList.set(i, "Test string!");
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of stringLinkedList for set method (100000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        /* System output:
        Test of ArrayList and LinkedList for set method (1000, 10000, 1000000 elements). Time in millis:

        Test of integerArrayList for set method (1000 element). Time = 0 (start = 1476041703781, finish = 1476041703781)
        Test of integerLinkedList for set method (1000 element). Time = 15 (start = 1476041703781, finish = 1476041703796)
        Test of stringArrayList for set method (1000 element). Time = 0 (start = 1476041703796, finish = 1476041703796)
        Test of stringLinkedList for set method (1000 element). Time = 0 (start = 1476041703796, finish = 1476041703796)

        Test of integerArrayList for set method (10000 element). Time = 0 (start = 1476041703796, finish = 1476041703796)
        Test of integerLinkedList for set method (10000 element). Time = 454 (start = 1476041703796, finish = 1476041704250)
        Test of stringArrayList for set method (10000 element). Time = 0 (start = 1476041704250, finish = 1476041704250)
        Test of stringLinkedList for set method (10000 element). Time = 328 (start = 1476041704250, finish = 1476041704578)

        Test of integerArrayList for set method (100000 element). Time = 15 (start = 1476041704578, finish = 1476041704593)
        Test of integerLinkedList for set method (100000 element). Time = 65813 (start = 1476041704593, finish = 1476041770406)
        Test of stringArrayList for set method (100000 element). Time = 0 (start = 1476041770406, finish = 1476041770406)
        Test of stringLinkedList for set method (100000 element). Time = 124172 (start = 1476041770406, finish = 1476041894578) */

        System.out.println("\nSystem output:\nTest of ArrayList and LinkedList for get method (1000, 10000, 100000 elements). Time in millis:\n");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            integerArrayList.get(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of integerArrayList for get method (1000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            integerLinkedList.get(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of integerLinkedList for get method (1000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            stringArrayList.get(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of stringArrayList for get method (1000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            stringLinkedList.get(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of stringLinkedList for get method (1000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            integerArrayList.get(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("\nTest of integerArrayList for get method (10000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            integerLinkedList.get(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of integerLinkedList for get method (10000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            stringArrayList.get(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of stringArrayList for get method (10000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            stringLinkedList.get(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of stringLinkedList for get method (10000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            integerArrayList.get(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("\nTest of integerArrayList for get method (100000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            integerLinkedList.get(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of integerLinkedList for get method (100000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            stringArrayList.get(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of stringArrayList for get method (100000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            stringLinkedList.get(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of stringLinkedList for get method (100000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        /* System output:
        Test of ArrayList and LinkedList for get method (1000, 10000, 100000 elements). Time in millis:

        Test of integerArrayList for get method (1000 element). Time = 0 (start = 1476042169609, finish = 1476042169609)
        Test of integerLinkedList for get method (1000 element). Time = 0 (start = 1476042169609, finish = 1476042169609)
        Test of stringArrayList for get method (1000 element). Time = 0 (start = 1476042169609, finish = 1476042169609)
        Test of stringLinkedList for get method (1000 element). Time = 16 (start = 1476042169609, finish = 1476042169625)

        Test of integerArrayList for get method (10000 element). Time = 0 (start = 1476042169625, finish = 1476042169625)
        Test of integerLinkedList for get method (10000 element). Time = 437 (start = 1476042169625, finish = 1476042170062)
        Test of stringArrayList for get method (10000 element). Time = 0 (start = 1476042170062, finish = 1476042170062)
        Test of stringLinkedList for get method (10000 element). Time = 344 (start = 1476042170062, finish = 1476042170406)

        Test of integerArrayList for get method (100000 element). Time = 0 (start = 1476042170406, finish = 1476042170406)
        Test of integerLinkedList for get method (100000 element). Time = 59359 (start = 1476042170406, finish = 1476042229765)
        Test of stringArrayList for get method (100000 element). Time = 0 (start = 1476042229765, finish = 1476042229765)
        Test of stringLinkedList for get method (100000 element). Time = 124625 (start = 1476042229781, finish = 147604 */

        System.out.println("\nSystem output:\nTest of ArrayList and LinkedList for remove method (1000, 10000 elements). Time in millis:\n");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            integerArrayList.remove(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of integerArrayList for remove method (1000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            integerLinkedList.remove(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of integerLinkedList for remove method (1000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            stringArrayList.remove(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of stringArrayList for remove method (1000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            stringLinkedList.remove(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of stringLinkedList for remove method (1000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            integerArrayList.remove(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("\nTest of integerArrayList for remove method (10000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            integerLinkedList.remove(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of integerLinkedList for remove method (10000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            stringArrayList.remove(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of stringArrayList for remove method (10000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            stringLinkedList.remove(i);
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Test of stringLinkedList for remove method (10000 element). Time = " + (finishTime - startTime) + " (start = " + startTime + ", finish = " + finishTime + ")");

        /* System output:
        Test of ArrayList and LinkedList for remove method (1000, 10000). Time in millis:

        Test of integerArrayList for remove method (1000 element). Time = 2672 (start = 1476042419593, finish = 1476042422265)
        Test of integerLinkedList for remove method (1000 element). Time = 0 (start = 1476042422265, finish = 1476042422265)
        Test of stringArrayList for remove method (1000 element). Time = 2797 (start = 1476042422265, finish = 1476042425062)
        Test of stringLinkedList for remove method (1000 element). Time = 0 (start = 1476042425062, finish = 1476042425062)

        Test of integerArrayList for remove method (10000 element). Time = 28359 (start = 1476042425062, finish = 1476042453421)
        Test of integerLinkedList for remove method (10000 element). Time = 469 (start = 1476042453421, finish = 1476042453890)
        Test of stringArrayList for remove method (10000 element). Time = 28141 (start = 1476042453890, finish = 1476042482031)
        Test of stringLinkedList for remove method (10000 element). Time = 469 (start = 1476042482031, finish = 1476042482500) */
    }
}
