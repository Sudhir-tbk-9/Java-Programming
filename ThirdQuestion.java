package programming845;
import java.util.Scanner;
public class ThirdQuestion {
/*
A student will not be allowed to sit in an exam 
if his/her attendance is less than 75%.
Take the following input from user :
Number of classes held
Number of classes attended.
And print---->
Percentage of class attended
Is the student is allowed to sit in the exam or not.
 */
	static double percent ;
	static String eligibility ;
	static double percentage ;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number of classes held");
		double heldcl = sc.nextInt();
		
		System.out.println("enter number of classes attended");
		double attdcl = sc.nextInt();
		
		percentage = calculatePercent(attdcl,heldcl);
		System.out.println("===========================================================================");
		System.out.println("Your attendence is " + percentage + "%. So, " + eligibleToAttend(percentage) + "eligible to appear in the exam.");
		System.out.println("===========================================================================");
	}
	
	public static double calculatePercent(double attdcl , double heldcl) {
		
		percent = (attdcl/heldcl)*100 ;
		
		return percent ;
	}
	
	public static String eligibleToAttend(double percentage) {
		if(percentage >= 75) {
			eligibility = "you are " ;
		}
		else {
			eligibility = "you are not ";
		}
		return eligibility ;
	}
	
	
	
}
