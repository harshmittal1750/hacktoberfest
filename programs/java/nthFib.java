import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class nthFib {
 
private static long nthFibo(int n, long[] experience) {
		
		if (n == 0 || n == 1) { 
			return n;
		}

		if(experience[n] != -1) {
			return experience[n];
		}
		
		long c1 = nthFibo(n - 1, experience);
		long c2 = nthFibo(n - 2, experience);

		return experience[n] = c1 + c2;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long[] experience = new long[n + 1];
		
		Arrays.fill(experience, -1);
		long a = nthFibo(n, experience);
		System.out.println(a);
	}
}
