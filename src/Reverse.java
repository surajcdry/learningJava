import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = kb.nextInt();

        int rev = 0, temp;

        while (num > 0) {
            temp = num % 10;
            rev = (rev * 10) + temp;

            num = num / 10;
        }

        System.out.println("Reverse: " + rev);

        kb.close();
    }
}
