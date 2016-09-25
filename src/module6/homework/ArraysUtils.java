package module6.homework;

public final class ArraysUtils {

    public final static int sum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    public final static double sum(double[] array) {
        double sum = 0;
        for (double element : array) {
            sum += element;
        }
        return sum;
    }

    public final static int min(int[] array) {
        int min = array[0];
        for (int element : array) {
            if (element < min)
                min = element;
        }
        return min;
    }

    public final static double min(double[] array) {
        double min = array[0];
        for (double element : array) {
            if (element < min)
                min = element;
        }
        return min;
    }

    public final static int max(int[] array) {
        int max = array[0];
        for (int element : array) {
            if (element > max)
                max = element;
        }
        return max;
    }

    public final static double max(double[] array) {
        double max = array[0];
        for (double element : array) {
            if (element > max)
                max = element;
        }
        return max;
    }

    public final static int maxPositive(int[] array) {
        int max = array[0];
        for (int element : array) {
            if (element > 0 && element > max)
                max = element;
        }
        return max;
    }

    public final static double maxPositive(double[] array) {
        double max = array[0];
        for (double element : array) {
            if (element > 0 && element > max)
                max = element;
        }
        return max;
    }

    public final static long multiplication(int[] array) {
        long mul = 1;
        for (long element : array) {
            mul *= element;
        }
        return mul;
    }

    public final static double multiplication(double[] array) {
        double mul = 1.0;
        for (double element : array) {
            mul *= element;
        }
        return mul;
    }

    public final static int modulus(int[] array) {
        return array[0] % array[array.length - 1];
    }

    public final static double modulus(double[] array) {
        return array[0] % array[array.length - 1];
    }

    public final static int secondLargest(int[] array) {
        int firstLargest = max(array);
        int secondLargest = array[0];
        for (int element : array) {
            if (element < firstLargest && element > secondLargest)
                secondLargest = element;
        }
        return secondLargest;
    }

    public final static double secondLargest(double[] array) {
        double firstLargest = max(array);
        double secondLargest = array[0];
        for (double element : array) {
            if (element < firstLargest && element > secondLargest)
                secondLargest = element;
        }
        return secondLargest;
    }

    public final static int[] reverse(int[] array) {
        int tempElement;
        int lastArrayIndex = array.length - 1;
        for (int i=0; i < array.length/2; i++){
            tempElement = array[i];
            array[i] = array[lastArrayIndex - i];
            array[lastArrayIndex - i] = tempElement;
        }
        return array;
    }

    public final static double[] reverse(double[] array) {
        double tempElement;
        int lastArrayIndex = array.length - 1;
        for (int i=0; i < array.length/2; i++){
            tempElement = array[i];
            array[i] = array[lastArrayIndex - i];
            array[lastArrayIndex - i] = tempElement;
        }
        return array;
    }

    public final static int[] findEvenElements(int[] array){
        int counter = 0;
        int[] result;
        int i = 0;
        for (int element : array) {
            if (element % 2 == 0) counter++;
        }

        result = new int[counter];
        for (int element : array) {
            if (element % 2 == 0) result[i++] = element;
        }
        return result;
    }

    public final static double[] findEvenElements(double[] array){
        int counter = 0;
        double[] result;
        int i = 0;
        for (double element : array) {
            if (element % 2 == 0) counter++;
        }

        result = new double[counter];
        for (double element : array) {
            if (element % 2 == 0) result[i++] = element;
        }
        return result;
    }




}
