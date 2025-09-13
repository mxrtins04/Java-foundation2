/*
- Prompt the user to put in a number.
- Assign the value to the variable balance.
- Check if balance is less than 100. If so, display "Low". If not,
- Check if less than or equal to 1000 and greater than or greater than and equal to 100. If so print "Medium". If not,
- Print "High".
*/

import java.util.Scanner;

public class Balance{
public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Input a number: ");
	int balance = input.nextInt();

	if(balance < 100){
		System.out.print("Low");
}
	else if(balance <= 1000 && balance >= 100){
		System.out.print("Medium");
}
	else{System.out.print("High");
}
	}
}