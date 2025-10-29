package Basics;
import java.util.Scanner;
import java.lang.Math;

public class Prime {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = kb.nextInt();

        if (isPrime(num)) {
            System.out.println("Prime");
        } else if (num <= 1) {
            System.out.println("Neither prime nor composite.");
        } else {
            System.out.println("Composite");
        }
        kb.close();
    }

    static boolean isPrime(int num) {
        if (num == 2) {
            return true;
        } else if (num <= 1 || num % 2 == 0) {
            return false;
        } else {
            int limit = (int) Math.sqrt(num);
            for (int i = 3; i <= limit; i += 2) {
                if (num % i == 0) {
                    return false;
                }
            }
        }

        return true;
    }
}
