/* 
- Prompt the user to put in the amount of hours spent working.
- Assign the user's input to workHours
- Initialize a new variable, payrate($), and assign the value 8 to it.
- Initialize a new variable, totalPay($). This variable should be equal to payrate multiplied by workHours.
- Check if workHours is greater than 40. If so multiply totalPay by 1.5
*/

import java.util.Scanner;

public class Pay{
public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Input number of hours spent working: ");
	int workHours = input.nextInt();
	int payrate = 8;
	double totalPay = payrate * workHours;
	
	if(workHours > 40){
		totalPay = (payrate * workHours) * 1.5;
}
	// System.out.print(totalPay);
	}
}