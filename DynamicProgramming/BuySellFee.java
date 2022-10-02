package DynamicProgramming;

import java.util.Scanner;

public class BuySellFee {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= scan.nextInt();
        }
        int fee= scan.nextInt();
        int bsp=-arr[0];
        int ssp=40;
        for(int i=1;i<n;i++)
        {
            int tssp=arr[i]+bsp-fee;
            bsp=Math.max(bsp,ssp-arr[i]);
            ssp=Math.max(ssp,tssp);
        }
        System.out.println(ssp);


    }
}
