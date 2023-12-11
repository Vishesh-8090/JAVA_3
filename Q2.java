import java.util.*;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the volume of water");
		int ml = sc.nextInt();
		if(ml>5000) {
			System.out.println("Yes, Alice you are following Doctor's advice");
		}
		else {
			System.out.println("No, alice you are not following Doctor's advice");
		}
	}

}
