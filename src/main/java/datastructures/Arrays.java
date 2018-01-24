package datastructures;

public class Arrays {

    public static int[] leftRotation(int[] array, int shift) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; ++i) {
            result[(i - shift + array.length) % array.length] = array[i];
        }
        return result;
    }

    public static int[] rightRotation(int[] array, int shift) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; ++i) {
            result[(i + shift) % array.length] = array[i];
        }
        return result;
    }

}

