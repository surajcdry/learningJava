package Basics;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("\nEnter the number to check armstrong: ");
        int num = kb.nextInt();

        if (isArmstrong(num)) {
            System.out.println("Armstrong.\n");
        } else {
            System.out.println("Not armstrong.\n");
        }

        kb.close();
    }

    static boolean isArmstrong(int num) {
        int temp, sum = 0, original = num;
        int power = String.valueOf(original).length(); // for any number of digits

        while (num > 0) {
            temp = num % 10;
            sum = sum + (int) (Math.pow(temp, power));
            num = num / 10;
        }

        return (sum == original);
    }
}
