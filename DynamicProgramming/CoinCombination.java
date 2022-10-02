package DynamicProgramming;

import java.util.Scanner;

public class CoinCombination {
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
       for(int i=0;i<arr.length;i++)
       {
           for(int j=1;j<=sum;j++)
           {
               if(j>=arr[i])
               {
                   if(dp[j-arr[i]]>0)
                   {
                       dp[j]+=dp[j-arr[i]];
                   }
               }
           }
       }
        System.out.println(dp[sum]);
    }
}
