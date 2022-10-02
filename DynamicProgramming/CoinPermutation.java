package DynamicProgramming;

import java.util.Scanner;

public class CoinPermutation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        int sum=scan.nextInt();
        int[] dp=new int[sum+1];
        dp[0]=1;
            for(int j=1;j<dp.length;j++)
            {
                for(int i=0;i<arr.length;i++) {
                if(j>=arr[i])
                {
                    dp[j]+=dp[j-arr[i]];
                }
            }
        }
        System.out.println(dp[sum]);
    }
}
