import java.util.Scanner;
import java.lang.Math;

public class GreatestNum {
    public static void main(String[] args) throws Exception {
        Scanner kb = new Scanner(System.in);

        // find the greatest number
        System.out.print("How many numbers: ");
        int count = kb.nextInt();

        float[] nums = new float[count];

        // to get all the input
        for (int i = 0; i < count; i++) {
            System.out.print("Number in position " + (i + 1) + ": ");
            nums[i] = kb.nextFloat();
        }

        // finding the greatest value
        float max = nums[0];
        for (int i = 1; i < count; i++) {
            max = Math.max(max, nums[i]);
        }

        System.out.println("Max value: " + max);

        kb.close();
    }
}
