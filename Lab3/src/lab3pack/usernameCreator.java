/**
 * 
 */
package lab3pack;

import java.util.Scanner;

/**
 * @author perbraa
 *
 */
public class usernameCreator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String FirstName;
		String LastName;
		String Address;
		
		System.out.println("This program will create a user name using your first name, last name and address");
		System.out.println("Please input your first name");
		FirstName = input.nextLine();


		
		StringBuilder sb = new StringBuilder();
		
		
		
		while (!(FirstName.isEmpty())) {
			sb.append(FirstName);
			System.out.println("Please input your last name");
			LastName = input.nextLine();
			if(!(LastName.isEmpty())){
				sb.replace(1,FirstName.length(),LastName);
				System.out.println("Please input your address");
				Address = input.nextLine();
						if(!(Address.isEmpty())) {
							sb.replace(2,LastName.length(),Address);
							sb.delete(6, sb.length());
							
							System.out.println("Your Username is " + sb);
							
							break; 
						
						}
				
			}//endif
		}//endwhile
	}

}
