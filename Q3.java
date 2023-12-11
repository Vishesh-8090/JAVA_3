import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input First number: ");
		int a = sc.nextInt();
		System.out.println("Input Second number: ");
		int b = sc.nextInt();
		System.out.println("Input Third number: ");
		int c = sc.nextInt();
		
		if(a<b && b<c) {
			System.out.println("Increasing");
		}
		else if(c<b && b<a) {
			System.out.println("Dcreasing");
		}
		else {
			System.out.println("Neither Increasing nor Decreasing");
		}
	}

}
