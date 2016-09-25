package module6.homework;

import java.util.Arrays;

public class Main {

    public static void main (String[] args){
        double[] array1 = new double[]{1.0, 2.0, 3.0, 4.0};
        int[] array2 = new int[]{1, 2, 3, 4, 5};
        double[] array3 = new double[]{1, 2, 3, 4, 5, 6};
        double[] array4 = new double[]{1, 2, 3, 4, 5, 6, 7};
        double[] array5 = new double[]{1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(Arrays.toString(ArraysUtils.reverse(array1)));
        System.out.println(Arrays.toString(ArraysUtils.reverse(array2)));
        System.out.println(Arrays.toString(ArraysUtils.reverse(array3)));
        System.out.println(Arrays.toString(ArraysUtils.reverse(array4)));
        System.out.println(Arrays.toString(ArraysUtils.reverse(array5)));

        System.out.println(Arrays.toString(ArraysUtils.findEvenElements(array1)));
        System.out.println(Arrays.toString(ArraysUtils.findEvenElements(array2)));
        System.out.println(Arrays.toString(ArraysUtils.findEvenElements(array3)));
        System.out.println(Arrays.toString(ArraysUtils.findEvenElements(array4)));
        System.out.println(Arrays.toString(ArraysUtils.findEvenElements(array5)));

    }
}
