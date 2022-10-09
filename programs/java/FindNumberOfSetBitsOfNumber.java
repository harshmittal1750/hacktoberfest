import java.util.*;
class FindNumberOfSetBitsOfNumber{
	public static void main(String[] nums){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int count = 0;
		while(n!=0){
			int bit = n&1;
			if(bit==1){
				count++;
			}
			n = n>>1;
		}
		System.out.println("Set Bits : "+count);
	}
}
