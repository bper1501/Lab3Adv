/**
 * 
 */
package lab3pack;

import java.util.Scanner;

/**
 * @author perbraa
 *
 */
public class phoneNumberFormat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String digits = "";
		
		System.out.println("This Program will format 10 digits into a phone number");
		System.out.println("Please input 10 digits");
		digits = input.nextLine();
		
		numformat(digits);
		
		


	}
	
	public static void numformat(String digits) {
		java.text.MessageFormat phoneNumForm = new java.text.MessageFormat("({0}){1}-{2}");
		String[] phoneNumArr={digits.substring(0, 3),
		          digits.substring(3,6),
		          digits.substring(6)};

		System.out.println(phoneNumForm.format(phoneNumArr));
	}

}
