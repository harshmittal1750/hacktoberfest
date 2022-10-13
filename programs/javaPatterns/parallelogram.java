/*  parallelogram pattern in Java
        ********
       ********
      ********
     ********
*/
import java.util.Scanner;
public class parallelogram {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter row");
            int row = sc.nextInt();
            System.out.println("Enter column");
            int col = sc.nextInt();
            for (int i=1;i<=row;i++)
            {
                for(int j=row-1;j>=i;j--)
                {
                    System.out.print(" ");
                }
                for(int k=1;k<=col;k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            sc.close();
        }
    }
