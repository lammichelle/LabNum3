import java.util.Scanner;

public class LabNum3 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		String answer;
		
		System.out.println("What is your name?");
		String name = scnr.next();
		
		do {
			
			System.out.println("Enter a number between 1 and 100:");

			int userNum = scnr.nextInt();
			
		if (userNum >= 1 && userNum <= 100) {
			if (userNum % 2 != 0 && userNum > 60) {
				System.out.println("Output: " + userNum + " Odd and over 60");
			} else if (userNum % 2 == 0 && userNum > 60) {
				System.out.println("Output: " + userNum + " Even");
			} else if (userNum % 2 == 0 && userNum >= 26) {
				System.out.println("Even");
			} else if (userNum % 2 == 0 && userNum <= 25 && userNum >= 2) {
				System.out.println("Even and less than 25");
			} else if (userNum % 2 != 0) {
				System.out.println("Odd");
			}
		}
		else {
			System.out.println("Number is out of range - please enter a value between 0 and 100");
		}
		
		System.out.println("Continue? (yes/no)");
		answer = scnr.next();
		if (answer.equalsIgnoreCase("no")) {
			System.out.println("Bye!");
			break;
		}
			
		}while(answer.equalsIgnoreCase("yes"));	
		
	
	}


}
