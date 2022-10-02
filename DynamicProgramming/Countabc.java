package DynamicProgramming;

import java.util.Scanner;

public class Countabc {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        int a=0,b=0,c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
            {
                a=2*a+1;
            }else if(s.charAt(i)=='b')
            {
                b=2*b+a;
            }else
            {
                c=2*c+b;
            }
        }

        System.out.println(c);
    }
}
