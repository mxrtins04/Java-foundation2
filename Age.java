/*
- Prompt the user to put in an input.
- Assign the user's input to the variable, age.
- Check if age is greater than or equal to 0 and less than or equal to 12. If so display "You are a child". If not,
- Check if age is greater than or equal to 13 and less than or equal to 19. If so display "You are a teen!". if not,
- Check if age is greater than or equal to 20 and less than or equal to 59. If so display "You are a teen!". if not,
- Display "You are a senior".
*/

import java.util.Scanner;

public class Age{
public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Input your age: ");
	int age = input.nextInt();
	
	if(age >= 0 && age <= 12){
	System.out.print("You are a child");
}	
	else if(age <= 19 && age >= 13){
	System.out.print("You are a teen");
}
	else if(age <= 59 && age >= 20){
	System.out.print("You are an adult");
}
	else{ System.out.print("You are an elder");
}
}}
