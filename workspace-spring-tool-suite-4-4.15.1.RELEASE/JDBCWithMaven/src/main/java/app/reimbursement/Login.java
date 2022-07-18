package app.reimbursement;

import java.util.Scanner;

/*
 * The class for the login feature of the app. 1) Login to app: username and password. 
 * 	a)Should have unique entries: username/password must match existing profile
 * 	b)If username/password match, login. If not, return error message
 */
public class Login {
	
	public static void main (String[]args) {
	Scanner scan = new Scanner (System.in);
	
	System.out.print("Enter username: ");
	String username = scan.next();
	
	scan.next();
	
	System.out.print("Enter password: ");
	String password = scan.next();
	
	
		scan.close();
	}

}
