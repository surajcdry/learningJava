package Basics;
public class scope {
    public static void main(String[] args) {
        int a = 4;
        System.out.println(a);

        {
            int b = 5;
            System.out.println(b);
        }
        int b = 6;
        System.out.println(b);
    }
}
