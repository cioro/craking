package theoryquestion;

public class HorseRacing {

    /**
     * You are given as input an unsorted array of n distinct numbers, where n is a power of 2.
     * Give an algorithm that identifies the second largest number in the array.
     */

    public static int naiveSecond(int[] array) {
        int max;
        int secondMax;

        if (array.length == 0) {
            return 0;
        }

        if (array.length == 1) {
            return array[0];
        }

        if (array[0] > array[1]) {
            max = array[0];
            secondMax = array[1];
        } else {
            max = array[1];
            secondMax = array[0];
        }

        for (int i = 2; i < array.length; ++i) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax) {
                secondMax = array[i];
            }
        }

        return secondMax;
    }

    public static int naiveSecondInPlace(int[] array) {

        if (array.length == 0) {
            return 0;
        }

        if (array.length == 1) {
            return array[0];
        }

        if (array[0] < array[1]) {
            int temp = array[0];
            array[0] = array[1];
            array[1] = temp;
        }

        for (int i = 2; i < array.length; ++i) {
            if (array[i] > array[0]) {
                array[1] = array[0];
                array[0] = array[i];
            } else if (array[i] > array[1]) {
                array[1] = array[i];
            }
        }

        return array[1];
    }

    static int log(int x, int base)
    {
        return (int) (Math.log(x) / Math.log(base));
    }

    static int pow(int base, int power) {
        int result = 1;
        for (int i = 0; i < power; i++)
            result *= base;
        return result;
    }

//    public static int fastSolution(int[] a) {
//
//        for (int j = 0; j < a.length; j = pow(2, j)) {
//            System.out.println(j);
//            for (int i = 0; i < a.length; i = pow(2, j)) {
//                System.out.println(i);
//                System.out.println(j);
//                if (a[i + pow(2,j)] > a[i]) {
//                    int temp = a[i + ];
//                    a[i + j] = a[i];
//                    a[i] = temp;
//                }
//            }
//        }
//
//        for (int i = 0; i < a.length; ++i) {
//            System.out.print(a[i] + " ");
//        }
//        return 0;
//    }
}
