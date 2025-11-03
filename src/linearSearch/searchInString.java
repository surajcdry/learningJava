package linearSearch;

import java.util.Scanner;

public class searchInString {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("\nWord: ");
        String word = kb.nextLine();

        System.out.print("Target character: ");
        char target = kb.next().trim().charAt(0);

        int index = findTheIndex(word, target);

        if (index == -1) {
            System.out.println("\nTarget not found.\n");
        } else {
            System.out.println("\nThe index: " + index + "\n");
        }

        kb.close();
    }

    static int findTheIndex(String word, char target) {
        if (word.length() == 0) {
            return -1;
        }

        for (int index = 0; index < word.length(); index++) {
            if (word.charAt(index) == target) {
                return index;
            }
        }

        return -1;
    }
}
