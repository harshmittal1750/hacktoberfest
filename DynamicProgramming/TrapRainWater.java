package DynamicProgramming;

import java.util.Scanner;

public class TrapRainWater {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= scan.nextInt();
        }

        long ans=0;
        int lmi=0,rmi=n-1;;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>=arr[lmi])
            {
                lmi=i;
            }else
            {
                break;
            }
        }
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>=arr[rmi])
            {
                rmi=i;
            }else
            {
                break;
            }
        }

        int val=Math.min(arr[lmi],arr[rmi]);

       for(int i=lmi+1;i<rmi;i++)
       {
           ans+=(val>arr[i])?val-arr[i]:0;
       }
        System.out.println(ans);
    }
}
