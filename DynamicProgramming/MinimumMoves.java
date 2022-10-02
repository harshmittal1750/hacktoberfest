package DynamicProgramming;

import java.util.Scanner;

public class MinimumMoves {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        Integer[] dp=new Integer[n+1];
        dp[n]=0;
        countMoves(arr,dp);
        System.out.println(dp[0]);
    }

    private static void countMoves(int[] arr, Integer[] dp) {
        for(int i=arr.length-1;i>=0;i--)
        {
            int min=Integer.MAX_VALUE;
            for(int j=1;j<=arr[i]&&i+j<dp.length;j++)
            {
                if(dp[i+j]!=null)
                     min=Math.min(min,dp[i+j]);
            }
            if(min!=Integer.MAX_VALUE)
            {
                dp[i]=min+1;
            }
        }
    }
}
