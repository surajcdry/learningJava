package arrays;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("\nHow many numbers in array: ");
        int size = kb.nextInt();
        int[] nums = new int[size];

        System.out.print("Enter the int nums separated by space: ");
        for (int i = 0; i < size; i++) {
            nums[i] = kb.nextInt();
        }

        int[] reverse = reverseThis(nums);

        System.out.print("Reversed array: ");

        for (int num : reverse){
            System.out.print(num + " ");
        }
        System.out.println("\n");
        
        kb.close();
    }

    static int[] reverseThis(int[] nums) {
        int temp, size = nums.length;
        int[] reverse = new int[size]; // to not modify the original array

        for (int i = 0; i < (nums.length / 2); i++) {
            temp = nums[i];
            reverse[i] = nums[(size - 1) - i];
            reverse[size - 1 - i] = temp;
        }

        return reverse;
    }
}
