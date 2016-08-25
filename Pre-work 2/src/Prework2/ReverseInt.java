package Prework2;
import java.util.Scanner;

public class ReverseInt {

	public static void main(String []args){
		
		//create scanner to get user input
		Scanner input = new Scanner (System.in);
		
		//ask user to enter numbers 
		System.out.print("What number would you like to reverse?");
		
		//create variables
		int num = input.nextInt();
		
		int number = num ;
		
		int reverse = 0;
		
		int remainder;
		
		//if the number value is not 0 the while will operate
		while(number !=0){
			
			remainder = number % 10;
			reverse = (reverse * 10) + remainder;
			
			number = number/10;
			
			// close scanner input 
			input.close();
			
			
		}//while end
		
		//output the reverse number 
		System.out.print("The reverse number is:     "+reverse);
		
		
	}//main end
}//class end

