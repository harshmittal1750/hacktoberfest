package DynamicProgramming;

import java.util.PriorityQueue;
import java.util.Scanner;

public class FractionalKnapsack {
    static class Pair implements Comparable<Pair>
    {
        int weight;
        double wp;
        Pair(int weight,double wp)
        {
            this.weight=weight;
            this.wp=wp;
        }

        @Override
        public int compareTo(Pair o) {
            if(this.wp>o.wp)
            {
                return -1;
            }else {
                return 1;
            }
        }
    }
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
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++)
        {
            pq.add(new Pair(weight[i],values[i]*1.0/weight[i]));
        }
        double ans=0.0;

        while (pq.size()>0&&cap>0)
        {
            Pair val=pq.poll();
            if(val.weight<=cap)
            {
                ans+=val.weight*val.wp;
                cap-=val.weight;
            }else
            {
                ans+=cap*val.wp;
                cap=0;
            }
            System.out.println(val.weight+" "+val.wp+" "+cap);
        }
        System.out.println(ans);
    }
}
