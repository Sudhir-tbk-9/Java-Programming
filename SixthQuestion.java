package programming845;
import java.util.Scanner;
public class SixthQuestion {
public static void main(String[] args) {
	Scanner scn  = new Scanner(System.in); 
	int [] a = new int[10];
	int sum = 0 ;
	int lastdigi =0 ;

	System.out.println("enter 10 numbers 1 by 1");
	
	for(int index = 0 ;index < a.length ; index++) {
	
	
	a[index] = scn.nextInt();
	System.out.println("press enter ");
		
	lastdigi = a[index] % 10 ;
		
		sum = sum + lastdigi ;
	
		System.out.println(" adding last digit of ," +  a[index] + "..." );
	}
	System.out.println("Sum is "+ sum);
}
}














