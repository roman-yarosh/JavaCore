package module2.homework;

public class Task1 {

    static int sum(int[] balances) {
        int sum = 0;
        for (int balance : balances) {
                sum += balance;
        }
        return sum;
    }

    static double sum(double[] balances) {
        double sum = 0;
        for (double balance : balances) {
            sum += balance;
        }
        return sum;
    }

    static int min(int[] balances) {
        int min = balances[0];
        for (int balance : balances) {
            if (balance < min)
                min = balance;
        }
        return min;
    }

    static double min(double[] balances) {
        double min = balances[0];
        for (double balance : balances) {
            if (balance < min)
                min = balance;
        }
        return min;
    }

    static int max(int[] balances) {
        int max = balances[0];
        for (int balance : balances) {
            if (balance > max)
                max = balance;
        }
        return max;
    }

    static double max(double[] balances) {
        double max = balances[0];
        for (double balance : balances) {
            if (balance > max)
                max = balance;
        }
        return max;
    }

    static int maxPositive(int[] balances) {
        int max = balances[0];
        for (int balance : balances) {
            if (balance > 0 && balance > max)
                max = balance;
        }
        return max;
    }

    static double maxPositive(double[] balances) {
        double max = balances[0];
        for (double balance : balances) {
            if (balance > 0 && balance > max)
                max = balance;
        }
        return max;
    }

    static long multiplication(int[] balances) {
        long mul = 1;
        for (long balance : balances) {
            mul *= balance;
        }
        return mul;
    }

    static double multiplication(double[] balances) {
        double mul = 1.0;
        for (double balance : balances) {
            mul *= balance;
        }
        return mul;
    }

    static int modulus(int[] balances) {
        return balances[0] % balances[balances.length - 1];
    }

    static double modulus(double[] balances) {
        return balances[0] % balances[balances.length - 1];
    }


    static int secondLargest(int[] balances) {
        int firstLargest = max(balances);
        int secondLargest = balances[0];
        for (int balance : balances) {
            if (balance < firstLargest && balance > secondLargest)
                secondLargest = balance;
        }
        return secondLargest;
    }

    static double secondLargest(double[] balances) {
        double firstLargest = max(balances);
        double secondLargest = balances[0];
        for (double balance : balances) {
            if (balance < firstLargest && balance > secondLargest)
                secondLargest = balance;
        }
        return secondLargest;
    }

    public static void main(String[] args) {

        int[] balances1 = {1200, 250, 2000, -500, 3200, 1600, 2300, 4500, 305, 110};
        double[] balances2 = {1200.5, 250.5, 2000.5, -500.5, 3200.5, 1600.5, 2300.5, 4500.5, 305.5, 110.5};

        System.out.print("\nint array: ");
        for(int item : balances1)
            System.out.print(item + " ");

        System.out.print("\ndouble array: ");
        for(double item : balances2)
            System.out.print(item + " ");

        System.out.print("\nint sum: " + sum(balances1));
        System.out.print("\ndouble sum: " + sum(balances2));

        System.out.print("\nint min: " + min(balances1));
        System.out.print("\ndouble min: " + min(balances2));

        System.out.print("\nint max: " + max(balances1));
        System.out.print("\ndouble max: " + max(balances2));

        System.out.print("\nint maxPositive: " + maxPositive(balances1));
        System.out.print("\ndouble maxPositive: " + maxPositive(balances2));

        System.out.print("\nlong multiplication: " + multiplication(balances1));
        System.out.print("\ndouble multiplication: " + multiplication(balances2));

        System.out.print("\nint modulus: " + modulus(balances1));
        System.out.print("\ndouble modulus: " + modulus(balances2));

        System.out.print("\nint secondLargest: " + secondLargest(balances1));
        System.out.print("\ndouble secondLargest: " + secondLargest(balances2));

        /* Вывод результата в консоль
            int array: 1200 250 2000 -500 3200 1600 2300 4500 305 110
            double array: 1200.5 250.5 2000.5 -500.5 3200.5 1600.5 2300.5 4500.5 305.5 110.5
            int sum: 14965
            double sum: 14969.0
            int min: -500
            double min: -500.5
            int max: 4500
            double max: 4500.5
            int maxPositive: 4500
            double maxPositive: 4500.5
            long multiplication: -2399349538394472448
            double multiplication: -5.390667416805744E29
            int modulus: 100
            double modulus: 95.5
            int secondLargest: 3200
            double secondLargest: 3200.5
         */
    }
}
