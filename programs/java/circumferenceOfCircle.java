package func_and_methods;

import java.util.Scanner;

public class circumferenceOfCircle {
    public static void prDoubleCircumference(Double r) {
        Double c = r * 6.28;
        System.out.println(c);
    }

    public static void main(String[] args) {
        System.out.println("Please enter radius");
        Scanner sc = new Scanner(System.in);
        Double r = sc.nextDouble();
        System.out.println("--------------------------------------");
        sc.close();
        prDoubleCircumference(r);
    }
}
