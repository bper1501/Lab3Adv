/**
 * 
 */
package lab3pack;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author perbraa
 *
 */

public class stringCounter {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String userString = "";
		String exit = "exit";
		
	
		
		System.out.println("This Program will Counter the words your enter");
		System.out.println("Please input a string to be counted");
		userString = input.nextLine();
		
		while(!(userString.equals(exit))){
			
			if(!userString.isEmpty()) {
				counter(userString);
				System.out.println("to continue please enter another string to be counted or 'exit' to end the program");
				userString = input.nextLine();
				
				continue;
			}
			else {
				System.out.println("Please enter a string to be counted");
				userString = input.nextLine();
				continue;
			}
			
			
		}//end of while

		
		System.out.println("Program has concluded");
		

		
		
	}//end of main
	
	public static void counter(String userString) {
		
		StringTokenizer st = new StringTokenizer(userString);
		System.out.println("Your string contains " + st.countTokens() + " words");
		
	}

}
