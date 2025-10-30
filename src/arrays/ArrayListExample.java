package arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        ArrayList<String> cars = new ArrayList<String>();

        System.out.print("\nHow many cars: ");
        int count = kb.nextInt();
        kb.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.print("Model of car " + (i + 1) + ": ");
            cars.add(kb.nextLine());
        }

        System.out.println("\nAll the cars are as follows: \n");

        // advance for loop
        for (String car: cars){
            System.out.println(car);
        }
        System.out.println();

        kb.close();
    }
}
