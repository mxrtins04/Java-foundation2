/*
- Prompt the user to put in 3 numbers
- Assign the numbers to the following variables, num1, num2, num3.
- Check if num1 is greater than num2 and num3. If so print, num1 is the highest number. If not
- Check if num2 is greater than num1 and num3. If so print, num2 is the highest number. If not,
-  Check if num3 is greater than num2 and num1. If so print, num3 is the highest number. If not,
- Print all numbers are equal. */
import java.util.Scanner;

public class LargestNum{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Input 3 numbers(e.g 2 5 9)");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();

		if(num1 > num2 && num1 >num3){
			System.out.printf("%d is the highest number", num1);
		}
		else if(num2> num3 && num2 > num1){
			System.out.printf("%d is the highest number", num2);
		}
		else if(num3 > num2 && num3 >num1){
			System.out.printf("%d is the highest number", num3);
		}
		else{ System.out.print("They are all equal numbers");
		}

		}
}
		