package programming845;
import java.util.Scanner;
public class FirstQuestion {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int price = 100;
	System.out.println("enter quantity purchased");
	int qtypurch = scn.nextInt();
	int costfin = price * qtypurch;
	System.out.println(costfin + " is the cost before discount");
	System.out.println("final price After is " + findFinal(costfin) );
	
}
public static int findFinal(int costfin) {
	if (costfin > 1000) {
		costfin = costfin - (costfin *10/100);
	}
	return costfin ;
}
}
