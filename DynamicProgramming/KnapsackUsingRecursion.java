package DynamicProgramming;

import java.util.Scanner;

public class KnapsackUsingRecursion {

    static int ma=Integer.MIN_VALUE;
    public static void getAns(int idx,int weight,int amt,int tw,int [] weights,int[] amts)
    {
        if(idx>=weights.length)
        {
            if(weight<=tw)
            {
                ma=Math.max(ma,amt);
            }
            return ;
        }
        if(weight>tw)
        {
            return ;
        }
        if(weight<=tw)
        {
            ma=Math.max(ma,amt);
        }
        getAns(idx+1,weight+weights[idx],amt+amts[idx],tw,weights,amts);
        getAns(idx+1,weight,amt,tw,weights,amts);
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] weight=new int[n];
        int[] amt=new int[n];
        for(int i=0;i<n;i++)
        {
           amt[i]=scan.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            weight[j]=scan.nextInt();
        }
        int bc=scan.nextInt();
        getAns(0,0,0,bc,weight,amt);
        System.out.println(ma);
    }
}
