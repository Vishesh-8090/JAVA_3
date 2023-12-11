import java.util.Random;
import java.util.*;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user number between 1 to 9");
		System.out.print("Enter user number: ");
		int user = sc.nextInt();
		Random ra  = new Random();
		int comp =(int)(Math.random()*(9-1+1)+1);
		System.out.println("Computers guess: "+comp);
		
 		if(user==comp) System.out.println("You got it Right");
		else if (comp==user+1 && comp==user-1) System.out.println("Almost got it");
		else System.out.println("You got it Wrong");
		
	}

}
