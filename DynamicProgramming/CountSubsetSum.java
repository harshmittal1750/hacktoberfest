package DynamicProgramming;

import java.util.Scanner;

public class CountSubsetSum {
    public static int perfectSum(int arr[],int n, int sum)
    {
        // Your code goes here
        int[][] dp=new int[n+1][sum+1];
        dp[0][0]=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=sum;j++)
            {
                if(j<arr[i-1])
                {
                    dp[i][j]=dp[i-1][j];
                }else
                {
                    System.out.println("check "+j+" "+dp[i-1][j]+" "+dp[i-1][j-arr[i-1]]);
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-arr[i-1]];
                }
            }
        }
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=sum;j++)
            {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int[] arr=new int[n];
        int tar= scan.nextInt();
        for(int i=0;i<n;i++)
        {
            arr[i]= scan.nextInt();
        }
        perfectSum(arr,n,tar);
    }
}
