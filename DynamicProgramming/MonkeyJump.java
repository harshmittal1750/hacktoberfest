package DynamicProgramming;

import java.util.HashMap;
import java.util.Scanner;

class A
{
    int rollno;
    A(int rollno)
    {
        this.rollno=rollno;
    }
    public int hashCode()
    {
        return rollno%6;
    }
    public String toString()
    {
        return rollno+"";
    }
}
public class MonkeyJump {
    public static void main(String[] args)
    {
//        A a=new A(15);
//        A a1=new A(21);
//        A a2=new A(20);
//        A a3=new A(6);
//        System.out.println(a1.hashCode());
//
//        HashMap<A,Integer> h=new HashMap<>();
//        System.out.println();
//        h.put(a,1);
//        h.put(a1,4);
//        h.put(a2,6);
//        h.put(a3,2);
//        System.out.println(h);
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= scan.nextInt();
        }
        int[] ans=new int[n+1];
        ans[n]=0;
        for(int i=n-1;i>=0;i--)
        {
            int min=Integer.MAX_VALUE;
            for(int j=1;j<=arr[i]&&i+j<ans.length;j++)
            {
                min=Math.min(min,ans[i+j]);
            }
            ans[i]=min+1;
        }
        for(int i:ans)
        {
            System.out.println(i);
        }
        System.out.println(ans[0]);
    }
}
