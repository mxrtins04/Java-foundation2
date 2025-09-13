/*
- Prompt the user to input a number.
- Assign the user's input to the variable num.
- Check if num has any remainders when it is divided by 5 or 3. If it doesn't have remainders when it is divided by both of these numbers display "Divisible by both". If not,
- Check if num has no reaminder when divided by 5 but has remainders when divided by 3. If so, print "Divisible by 5". If not,
- Check if num is divisible by 3 and is not divisible by 5. If so, print "Divisible by 3". If not,
- Print "Not divisible".
*/

import java.util.Scanner;

public class Number{
public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Input a number: ");
	int num = input.nextInt();

	if(num % 5 == 0 && num % 3 == 0){
		System.out.print("Divisible by both");
}
	else if(num % 5 == 0 && num % 3 != 0){
		System.out.print("Divisible by 5");
}
	else if(num % 5 != 0 && num % 3 == 0){
		System.out.print("Divisible by 3");
}
	else{System.out.print("Not divisible");
}
	}
}