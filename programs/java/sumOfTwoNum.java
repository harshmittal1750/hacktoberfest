package func_and_methods;

import java.util.Scanner;

public class sumOfTwoNum {
    public static void sum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        sum(a, b);
        sc.close();
    }
}
