import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the main number: ");
        int num = kb.nextInt();
        System.out.print("Which number to count: ");
        int target = kb.nextInt();

        int count = 0, temp;

        while (num > 0) {
            temp = num % 10;
            if (temp == target) {
                count++;
            }

            num = num / 10;
        }

        System.out.println("Count: " + count);

        kb.close();
    }
}
