package DynamicProgramming;

import java.util.Scanner;

public class TargetSumSubset {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        int sum=scan.nextInt();
        boolean[][] dp=new boolean[n+1][sum+1];
        dp[0][0]=true;
        boolean flag=false;
        for(int i=1;i<dp.length;i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (j < arr[i - 1]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    if (dp[i - 1][j - arr[i - 1]]) {
                        dp[i][j] = true;
                    }
                }
            }
            if (dp[i][sum]) {
                flag = true;
                break;
            }
        }
        System.out.println(flag);
    }
}
