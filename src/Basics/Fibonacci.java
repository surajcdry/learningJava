package Basics;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("How many items: ");
        int num = kb.nextInt();

        int a = 0, b = 1, c;

        if (num == 1) {
            System.out.println(a);
        } else if (num == 2) {
            System.out.println(a + " " + b);
        } else {
            System.out.print(a + " " + b + " ");

            for (int i = 2; i < num; i++) {
                c = a + b;
                a = b;
                b = c;
                System.out.print(c + " ");
            }

            System.out.println();
        }

        // to avoid memory leak. vs recommended
        kb.close();
    }
}
