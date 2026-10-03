import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter 10 array elements:");

        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements in reverse order:");

        for (int element : arr) {
            System.out.print(element + " ");
        }

        sc.close();
    }
}
