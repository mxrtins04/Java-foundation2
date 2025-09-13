/*
- Prompt the user to input a letter from A - F.
- If the user's input is either A, B, C, or D display "Pass".
- If the user's input is F display "Fail".
- For other scenarios print "Invalid".
*/

import java.util.Scanner;

public class Grade2{
public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Input a letter between A and F: ");
	
	String grade = input.next();
	
	if(grade.equals("A") || grade.equals("B") || grade.equals("C") || grade.equals("D")){
	System.out.print("Pass");
}
	else if(grade.equals("F")){
	System.out.print("Fail");
}
	else{System.out.print("Invalid");}
	}
}