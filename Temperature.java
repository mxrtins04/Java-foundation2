/* 
- Prompt the user to input a number
- Assign the users input to the variable, temp.
- Check if temp is less than 0. If so print "Freezing". If not,
- Check if temp is equal to or greater than 0 and less than 16. If so print "Cold". If not,
- Check if temp is equal to or greater than 16 and less than 26. If so, print "Warm". If not,
- Print "Hot" */

import java.util.Scanner;

public class Temperature{
public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Input a temperature: ");
	int temp = input.nextInt();

	if(temp < 0){
	System.out.print("Freezing");
}
	else if(temp >= 0 && temp <16){
	System.out.print("Cold");
}
	else if(temp >= 16 && temp <26){
	System.out.print("Warm");
}
	else{ System.out.print("Hot");
}
	}
}