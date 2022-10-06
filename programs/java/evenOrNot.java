package func_and_methods;

import java.util.Scanner;

public class evenOrNot {
    public static void notEven(int n) {

        if (n % 2 == 0) {
            System.out.println("it is even");

        } else {
            System.out.println("It is odd");

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        notEven(n);
        sc.close();
    }
}
