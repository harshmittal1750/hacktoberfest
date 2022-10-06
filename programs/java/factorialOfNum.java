package func_and_methods;

import java.util.Scanner;

public class factorialOfNum {
    public static void printFactorial(int n)

    {
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;

        }

        System.out.println(factorial);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactorial(n);
        sc.close();

    }
}