package programming845;
import java.util.Scanner;
public class NinthQuestion {
	static int num ;
	static int largest=Integer.MIN_VALUE;
	static String print = ""  ;
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.println("enter the count of number u want to save");
		int limit = scn.nextInt();
		
		for(int i = 1 ; i<= limit ; i++) {
		
			System.out.println("enter a number");
		
			num = scn.nextInt();
			System.out.println("u entered " + num + " " );
			print = print  + num  +"  " ;
			
					if(num >largest) {
						largest = num ;
				}	
		}
		
		System.out.println("list is : " + print);	
		System.out.println( "largest is : " + largest);
	}
	
	
}
