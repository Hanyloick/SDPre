import java.util.Scanner;

public class Objective5Lab4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;

		System.out.println("Please Enter a Number. ");
		num = scanner.nextInt();

		if (num % 2 == 0) {
			System.out.println("The Number is Even ");
		}
		else if (num % 2 != 0) {
			System.out.println("The Number is Odd ");	
		}
		scanner.close();
		
	}
}