package arrays.linearSearch;

import java.util.Scanner;

public class maxInRange {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("\nHow many numbers: ");
        int size = kb.nextInt();

        int[] nums = new int[size];
        int start, end;

        System.out.println("\nEnter the numbers: ");

        for (int i = 0; i < size; i++) {
            System.out.print("\tNumber " + (i + 1) + "(index " + i + "): ");
            nums[i] = kb.nextInt();
        }

        System.out.print("\nStarting index: ");
        start = kb.nextInt();
        System.out.print("Ending index: ");
        end = kb.nextInt();

        int max = maxFinder(nums, start, end);

        if (max == -1) {
            System.out.println("Invalid values. Try again!");
        } else {
            System.out.println("\nMax number in range: " + max + "\n");
        }

        kb.close();
    }

    static int maxFinder(int[] nums, int start, int end) {
        int max = 0;

        // edge cases
        if (start > end || nums == null) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        return max;
    }
}
