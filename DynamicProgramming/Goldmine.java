package DynamicProgramming;

import java.util.Scanner;

public class Goldmine {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=scan.nextInt();
            }
        }
        getMaxGold(arr);
    }

    private static void getMaxGold(int[][] arr) {
        for(int j=arr[0].length-2;j>=0;j--)
        {
            for(int i=0;i<arr.length;i++)
            {
                int max=arr[i][j+1];
                if(i-1>=0)
                {
                    max=Math.max(max,arr[i-1][j+1]);
                }
                if(i+1<arr.length)
                {
                    max=Math.max(max,arr[i+1][j+1]);
                }
                arr[i][j]+=max;
            }
        }
        int val=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
                val=Math.max(val,arr[i][0]);
        }

        System.out.println(val);
    }
}
