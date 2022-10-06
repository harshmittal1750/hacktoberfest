package func_and_methods;

import java.util.Scanner;

public class greaterNum {
    public static void printGreaterNum(int a, int b) {
        if (a > b) {
            System.out.println(a + " is greater");
        } else {
            System.out.println(b + " is greater");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("--------------------------------------");
        sc.close();
        printGreaterNum(a, b);
    }
}
