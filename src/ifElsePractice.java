import java.util.Scanner;

public class ifElsePractice {

	public static void main(String[] args) {

		// create scanner to take input
		Scanner scan = new Scanner(System.in);

		// prompt user for input
		System.out.println("Please enter a number: ");

		int userNum = scan.nextInt();

		if (userNum >= 0 && userNum <= 100) {
			if (userNum > 85) { // does not need to worry about 85 bc 85 in this if statement is false but falls
								// under the next statement
				System.out.println("A");
			} else if (userNum > 70) {
				System.out.println("B");
			} else if (userNum > 60) {
				System.out.println("C");
			} else if (userNum > 50) {
				System.out.println("D");
			}
			else {
				System.out.println("F");
			}

		} else {
			System.out.println("Number is out of range - please enter a value between 0 and 100");
		}

		scan.close();

	}

}
