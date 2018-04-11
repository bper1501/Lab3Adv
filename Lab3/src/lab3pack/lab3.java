/**
 * 
 */
package lab3pack;

import java.util.Scanner;
import java.util.regex.*;

/**
 * @author perbraa
 *
 */
public class lab3 {



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		//declarations
		String Password;
		String exit = "999";
		
		System.out.println("Please create a password. Password must be 6-10 characters long, contain atleast 1 numeric value "
				+ "and 1 Uppercase Letter");
		
		Password = input.nextLine();
		
		while(!(Password.equals(exit))) {
			
			PasswordStrong(Password);

			if(PasswordStrong(Password) == true) {
				
				System.out.print("Valid Password");
				break;
			}
			else {
				System.out.println("Invalid password. Password must be 6-10 characters long, contain at least"
						+ " 1 numeric value and 1 Uppercase letter" );
				Password = input.nextLine();
				
				
				}

		}
		
		

		}	
		public static boolean PasswordStrong(String pass) {
			String regex = "^(?=.*[0-9])(?=.*[A-Z])(?=\\S+$).{6,10}$";
		    Pattern patron = Pattern.compile(regex);
		    Matcher m = patron.matcher(pass);
		    if (m.find())
		        return true;
		    return false;
	}

}
