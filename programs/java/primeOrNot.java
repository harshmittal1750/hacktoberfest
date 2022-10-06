package func_and_methods;

import java.util.Scanner;

public class primeOrNot {
    public static void notPrimeNumber(int n) {
        int temp = 0;
        if (n <= 1) {
            System.out.println("it is not prime");

        } else {

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    temp += 1;

                }

            }
            if (temp > 0) {
                System.out.println("It is not a prime number");
            } else {
                System.out.println("It is a prime number");
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        notPrimeNumber(n);
        sc.close();
    }
}
