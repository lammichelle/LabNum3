import java.util.Scanner;

public class switchClassStatement {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		
		int userNum = scan.nextInt();
		
		switch (userNum) {
		
		//layering cases to provide multiple options 
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
			System.out.println("Your number is between 10 and 15.");
			break;
			//this will only match one option
		case 45:
			System.out.println("Your num is 45");
			break;
			default:  // acts like a catch all -- this is optional 
				System.out.println("No matching numbers!");
				break;
			
		}
	}

}
