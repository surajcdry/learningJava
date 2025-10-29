package arrays;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("\nHow many marks: ");
        int count = kb.nextInt();
        float sum = 0;

        float[] marks = new float[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Mark " + (i + 1) + ": ");
            marks[i] = kb.nextFloat();
            sum += marks[i];
        }

        System.out.println("The average: " + (sum / count) + "\n");

        kb.close();
    }
}
