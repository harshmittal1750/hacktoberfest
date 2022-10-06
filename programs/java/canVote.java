package func_and_methods;

import java.util.Scanner;

public class canVote {
    public static void printCanVote(int age) {
        if (age > 18) {
            System.out.println("Can Vote");
        } else {
            System.out.println("Cant vote");
        }

    }

    public static void main(String[] args) {
        System.out.println("Please enter age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("--------------------------------------");
        sc.close();
        printCanVote(age);
    }
}
