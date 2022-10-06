package func_and_methods;

import java.util.Scanner;

public class printTable {
    public static void table(int a, int b) {

        for (int i = 0; i <= b; i++) {
            System.out.println(a * i);
        }

    }

    public static void main(String[] args) {
        System.out.println(
                "Please enter which number table to print");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Please enter to which number table to be printed");
        int b = sc.nextInt();
        table(a, b);
        sc.close();
    }
}
