/* 
- Prompt the user to input number.
- Assign the user's input to the variable num.
- Check if num has any remainders when divided by two and is greater than zero. If this is true, display "Positive Odd". If not,
-  Check if num has no remainders when divided by two and is greater than zero. If this is true, display "Positive even". If not,
-  Check if num has any remainders when divided by two and is less than zero. If this is true, display "Negative Odd". If not,
- Check if num has no remainders when divided by two and is less than zero. If this is true, display "Negative Even". If not,
- Else print "Zero".
*/

import java.util.Scanner;

public class PrintOddEven{
public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Input a number: ");
	int num = input.nextInt();

	if(num % 2 != 0 && num > 0){
		System.out.print("Positive Odd");
}
	else if(num % 2 == 0 && num > 0){
		System.out.print("Positive Even");
}
	else if(num % 2 != 0 && num < 0){
		System.out.print("Negative Odd");
}
	else if(num % 2 <= 0 && num < 0){
		System.out.print("Negative Even");
}
	else{System.out.print("Zero");
}
	}
}