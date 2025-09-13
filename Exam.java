/*
- Prompt the user to put in their attendance percentage and average score
- Assign the user's input to the variables attendance and score respectively.
- Check if both score and attendance are greater than or equal to 75. If so, display "Eligible". Otherwise,
- Display "Not eligible".
*/

import java.util.Scanner;

public class Exam{
public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Input your attendance percentage and average score(e.g 87 95): ");
	int attendance = input.nextInt();
	int score = input.nextInt();

	if(score >= 75 && attendance >= 75){
		System.out.print("Eligible");
}
	else{System.out.print("Not eligible");
}
	}
}