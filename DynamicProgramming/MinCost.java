package DynamicProgramming;

import java.util.Scanner;

public class MinCost {
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

        getMinCost(arr);
        System.out.println(arr[0][0]);
    }

    private static void getMinCost(int[][] arr) {
        for(int i=arr.length-1;i>=0;i--)
        {
            for(int j=arr[0].length-1;j>=0;j--)
            {
                if(i+1<arr.length&&j+1<arr[0].length)
                {
                    int val=Math.min(arr[i][j+1],arr[i+1][j]);
                    arr[i][j]+=val;
                }else if(i+1<arr.length&&j+1>=arr[0].length)
                {
                    arr[i][j]+=arr[i+1][j];
                }else if(i+1>=arr.length&&j+1<arr[0].length)
                {
                    arr[i][j]+=arr[i][j+1];
                }
            }
        }
    }
}
