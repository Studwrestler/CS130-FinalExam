package FinalExam;
import java.util.*;
public class ArrayList1 {

	public static void main(String[] args) {
		Random generator = new Random();
		ArrayList<Integer> numbers = new ArrayList();
		int n = 10;
		for(int i = 0;i<n;i++) {
			numbers.add(generator.nextInt(30)+1);
		}
		for(int j = 0;j<numbers.size();j++) {
			System.out.println("The first number is: "+numbers.get(j)+". It's index is: "+ j);
		}
			
	}

}
