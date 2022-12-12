package FinalExam;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = scan.nextInt();
		if(a>10 && a%2!=0) {
			System.out.println("This number is greater than 10 and odd");
		}
		else {
			System.out.println("This is an even number or less than 10");
		}

	}

}
