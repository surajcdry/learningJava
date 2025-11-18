package arrays.linearSearch;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class evenDigits {
    public static void main(String[] args) {
        int[] nums = {555,-9011,482,1771};

        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums){
        int count = 0, temp;

        for (int num : nums){
            // temp = 0;
            // while (num > 0){
            //     temp++;
            //     num /= 10;
            // }

            // simpler solution
            if (num < 0){
                num *= -1; // negative number to positive
            }

            temp = (int) Math.log10(num) + 1;

            if (temp % 2 == 0){
                count++;
            }
        }

        return count;
    }
}
