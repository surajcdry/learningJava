import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        float a, b, result;
        char op;

        while (true) {
            System.out.print("\nEnter the operation (x or X to end): ");
            op = kb.next().trim().charAt(0);

            result = 0;

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter the first number: ");
                a = kb.nextFloat();

                System.out.print("Enter the second number: ");
                b = kb.nextFloat();

                switch (op) {
                    case '+':
                        result = a + b;
                        break;
                    case '-':
                        result = a - b;
                        break;
                    case '*':
                        result = a * b;
                        break;
                    case '/':
                        result = a / b;
                        break;
                    case '%':
                        result = a % b;
                        break;
                }

                System.out.println("Result: " + result);
            } else if (op == 'x' || op == 'X') {
                kb.close();
                break;
            } else {
                System.out.println("Invalid operation");
            }

        }
    }
}
