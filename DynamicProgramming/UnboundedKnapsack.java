package DynamicProgramming;

import java.util.Scanner;

public class UnboundedKnapsack {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int[] values=new int[n];
        int[] weight=new int[n];
        for(int i=0;i<n;i++)
        {
            values[i]= scan.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            weight[i]= scan.nextInt();
        }
        int cap= scan.nextInt();
        int[] dp=new int[cap+1];
        dp[0]=0;
        for(int j=0;j<n;j++) {
            for (int i = 1; i < dp.length; i++) {
                if (weight[j] <= i) {
                    int max = Math.max(dp[i], values[j] + dp[i - weight[j]]);
                    dp[i] = max;
                }
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i:dp)
        {
            max=Math.max(max,i);
        }
        System.out.println(max);
    }
}
