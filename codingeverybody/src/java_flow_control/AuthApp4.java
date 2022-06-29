package java_flow_control;

import java.util.Scanner;

public class AuthApp4 {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		Scanner l = new Scanner(System.in);

		String id;
		String pass;
		
		boolean islogined = true;
		int i = 1;
		while (islogined) {
			System.out.println(i+"th try");
			i++;
			System.out.println("Enter your ID : ");
			id = k.nextLine();
			System.out.println("Enter your Password : ");
			pass = k.nextLine();
			if(!id.equals("chunwoo") || !pass.equals("1111")) {
				System.out.println("Wrong ID or Password");
				System.out.println("==================");
			} else {
				System.out.println("Welcome, Boss.");
				islogined = false;
			}
		}
	}
}
