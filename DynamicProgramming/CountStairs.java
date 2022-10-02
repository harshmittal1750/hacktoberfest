package DynamicProgramming;

import java.util.Scanner;

public class CountStairs {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int[] arr=new int[n+1];
        arr[n]=1;
        countStairs(n,arr);
        System.out.println(arr[0]);
    }

    private static void countStairs(int n,int[] arr) {
        for(int i=n-1;i>=0;i--)
        {
            for(int j=1;j<=3&&i+j<arr.length;j++)
            {
                arr[i]+=arr[i+j];
            }
        }
    }
}
