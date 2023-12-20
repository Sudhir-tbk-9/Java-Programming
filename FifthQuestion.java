package programming845;
/*
A school has following rules for grading system:
a. Below 25 -F
b. 25 to 45 -E
c. 45 to 50 -D
d. 50 to 60 -C
e. 60 to 80 -B
f. Above 80 -A
Ask user to enter marks and print the corresponding grade.
 */
import java.util.Scanner;
public class FifthQuestion {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		System.out.println("please enter your marks in all the 5 subjects 1 by 1.");
		int a = scn.nextInt();
		System.out.println("enter next");
		int b = scn.nextInt();
		System.out.println("enter next");
		int c = scn.nextInt();
		System.out.println("enter next");
		int d = scn.nextInt();
		System.out.println("enter next");
		int e = scn.nextInt();
		
		int total = a+b+c+d+e ;
		double percent = total/5 ;
		
		if(percent>=80) {
			System.out.println("Your grade is A");
		}
		if(percent<80 && percent>=60) {
			System.out.println("Your grade is B");
		}
		if(percent<60 && percent>=50) {
			System.out.println("Your grade is C");
		}
		if(percent<50 && percent>=45) {
			System.out.println("Your grade is D");
		}
		if(percent<45 && percent>=25) {
			System.out.println("Your grade is E");
		}
		if(percent<25) {
			System.out.println("Your grade is F");
		}
	
	}
	
}
