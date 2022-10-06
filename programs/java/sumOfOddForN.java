package func_and_methods;

import java.util.Scanner;

public class sumOfOddForN {
    public static void sum(int a) {
        int su = 0;
        for (int i = 0; i <= a; i++) {
            if (i % 2 != 0) {

                su = su + i;
                System.out.print("+" + i + " ");
                System.out.println();
            }

        }
        System.out.println("Sum of all odd numbers till " + a + " is :" + " " + su);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("--------------------------------------");
        sc.close();
        sum(a);
    }
}
