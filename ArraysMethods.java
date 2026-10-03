import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 4};

        // toString()
        System.out.println("Original array: " + Arrays.toString(arr));

        // sort()
        Arrays.sort(arr);
        System.out.println("After sorting: " + Arrays.toString(arr));

        // binarySearch()
        int index = Arrays.binarySearch(arr, 4);
        System.out.println("Index of 4: " + index);

        // copyOf()
        int[] copy = Arrays.copyOf(arr, 7);
        System.out.println("Copied array: " + Arrays.toString(copy));

        // fill()
        int[] filled = new int[5];
        Arrays.fill(filled, 10);
        System.out.println("Filled array: " + Arrays.toString(filled));

        // equals()
        int[] arr2 = {1, 2, 4, 5, 8};
        System.out.println("Arrays are equal: " + Arrays.equals(arr, arr2));
    }
}
