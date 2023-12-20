package programming845;
import java.util.Scanner;
public class SecondQuestion {
static Scanner scn  = new Scanner(System.in);
static int bonus;
public static void main(String[] args) {
	
	System.out.println("Please enter your year of service lended to firm.");
	int yos = scn.nextInt();
	
	System.out.println("Please enter your Salary also...");
	int salary = scn.nextInt();
	
	int totalSalary = salary + checkbonus(salary,yos);
	
	System.out.println("Your total salary is " + totalSalary + " bucks." );
	
}
public static int checkbonus(int salary  , int yos ) {
	if(yos>5) {
		bonus = salary * 5/100;
		System.out.println("Bonus to be added : " + bonus);
	}
	else {
		System.out.println("No bonus granted.");
	}
	return bonus;
}
}
