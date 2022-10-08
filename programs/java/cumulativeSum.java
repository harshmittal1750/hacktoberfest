import java.util.Scanner;

public class cumulativeSum {
     public static void main(String[] args)
    {
        int i,sum=0;
        Scanner s = new Scanner(System.in);
        
	while(sum>=0)
	{	
                int N = s.nextInt();
		sum = sum + N;
		if(sum<0)
                {
                    break;
                }
                else
                {
                 System.out.println(N);
                }
               
        }
       
    }
}
