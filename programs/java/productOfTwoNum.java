package func_and_methods;

import java.util.Scanner;

public class productOfTwoNum {

    public static void product(int a, int b) {
        System.out.println(a * b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        product(a, b);
        sc.close();
    }
}
