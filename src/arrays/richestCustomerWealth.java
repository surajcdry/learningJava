package arrays;

// https://leetcode.com/problems/richest-customer-wealth/

public class richestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
            {1, 5},
            {7, 13},
            {3, 5}
        };

        System.out.println("Richest person's wealth: " + findRich(accounts));
    }

    static int findRich(int[][] accounts){
        int max = Integer.MIN_VALUE, sum = 0;

        for (int i = 0; i < accounts.length; i++){
            for (int j = 0; j < accounts[i].length; j++){
                sum += accounts[i][j];
            }

            if (sum > max){
                max = sum;
            }

            sum = 0;
        }

        return max;
    }
}
