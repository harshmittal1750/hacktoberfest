package DynamicProgramming;

import java.util.Scanner;

public class MaximumSumNonAdjacentElement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        int inc=arr[0],exc=0;
        for(int i=1;i<n;i++)
        {
            int temp=exc;
            exc=Math.max(exc,inc);
            inc=temp+arr[i];
        }
        System.out.println(Math.max(exc,inc));
    }
}
