package FinalExam;
import java.util.*;
public class MinorDetection {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age:");
		int a = scan.nextInt();
		if(a<18) {
			System.out.println("Their a minor");
		}
		else {
			System.out.println("Their not a minor");
		}

	}

}
