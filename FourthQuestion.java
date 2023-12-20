package programming845;
/*
Write a program to check whether a entered 
character is lowercase ( a to z )or uppercase ( A to Z ).
 */
import java.util.Scanner;
public class FourthQuestion {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.println("enter a alphabet");
		char input = scn.next().charAt(0);
		
		if (input > 'A'&& input<'Z') {
			System.out.println("Entered alphabet is in Uppercase.");
		}
		else if(input > 'a'&& input<'z') {
			System.out.println("Entered alphabet is in Lowercase.");
		}
		else {
			System.out.println("Please enter alphabets only.");
		}
		
	}
}
