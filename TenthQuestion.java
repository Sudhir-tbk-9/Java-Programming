package programming845;
import java.util.Scanner;
public class TenthQuestion {
	static int num ;
	static int largest=Integer.MIN_VALUE;
	static int Seclargest = Integer.MIN_VALUE ;
	static int Thirdlargest = Integer.MIN_VALUE ;
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
			if(num >largest ) {
				Thirdlargest = Seclargest ;
				Seclargest = largest;
				largest = num ;
				
				}
			
			else if( num > Seclargest && Seclargest != largest){
				 Thirdlargest = Seclargest ;
				Seclargest = num;
				
			}
			else if( num>Thirdlargest && Thirdlargest != Seclargest && Thirdlargest!=largest ){
						Thirdlargest = num ;
					
					}
			 	
		}
		
		System.out.println("list is : " + print);	
		System.out.println( "largest  no from above list is : " + largest);
	
		System.out.println( "2nd largest no from above list is : " + Seclargest);
		System.out.println("3rd largest no from above list is : " + Thirdlargest);
		}
	

}
