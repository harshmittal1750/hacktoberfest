package func_and_methods;

import java.util.Scanner;

public class average {
    public static void avg(Double a, Double b, Double c) {
        Double avg = (a + b + c) / 2;
        System.out.println(avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double c = sc.nextDouble();
        avg(a, b, c);
        sc.close();
    }
}
