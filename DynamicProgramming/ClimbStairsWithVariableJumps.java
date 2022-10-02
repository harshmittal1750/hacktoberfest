package DynamicProgramming;

import java.util.Scanner;

public class ClimbStairsWithVariableJumps {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        int[] dp=new int[n+1];
        dp[n]=1;
        countVariableJump(arr,dp);
        System.out.println(dp[0]);
    }

    private static void countVariableJump(int[] arr, int[] dp) {
        for(int i=arr.length-1;i>=0;i--)
        {
            for(int j=1;j<=arr[i]&&i+j<=arr.length;j++)
            {
                dp[i]+=dp[i+j];
            }
        }
    }
}
