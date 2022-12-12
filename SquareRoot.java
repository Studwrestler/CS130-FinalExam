package FinalExam;
import java.text.DecimalFormat;
import java.util.*;
public class SquareRoot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat f1 = new DecimalFormat("0.##");
		System.out.println("Enter a double-floating point number: ");
		double a = scan.nextDouble();
		System.out.println("The result is: "+Math.sqrt(a));
		System.out.println("The formated result is: "+f1.format(Math.sqrt(a)) );

	}

}
