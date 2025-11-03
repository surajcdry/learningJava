package linearSearch;

import java.util.Scanner;

public class indexFinder {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("\nLength of array: ");
        int size = kb.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter an array (separated by space): ");
        for (int i = 0; i < size; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.print("Target: ");
        int target = kb.nextInt();

        int index = findTheIndex(arr, target);

        if (index == -1) {
            System.out.println("\nTarget not found.\n");
        } else {
            System.out.println("\nThe index: " + index + "\n");
        }

        kb.close();
    }

    static int findTheIndex(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }

        return -1;
    }
}
