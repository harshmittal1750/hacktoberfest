package DynamicProgramming;

import java.util.Scanner;

public class PaintHouse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[][] arr=new int[n][3];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=scan.nextInt();
            }
        }

        int r=arr[0][0],b=arr[0][1],g=arr[0][2];
        for(int i=1;i<n;i++)
        {
            int tempr=r,tempb=b;
            r=arr[i][0]+Math.min(tempb,g);
            b=arr[i][1]+Math.min(tempr,g);
            g=arr[i][2]+Math.min(tempr,tempb);
        }
        System.out.println(Math.min(r,Math.min(g,b)));
    }
}
