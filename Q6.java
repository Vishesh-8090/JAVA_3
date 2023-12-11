import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your elecytricity units");
		double a = sc.nextFloat();
		
		if(a<=50) {
			double b = 3*a;
			System.out.println("The elecricity bill is "+b);	
		}
		else if (a>50 && a<=200) {
			double c = 50*3 + (a-50)*4.80;
			System.out.println("The elecricity bill is "+c);
		}
		else if(a>200 && a<=400) {
			double x = a-50;
			double d = 50*3 + (a-50)*4.80 + (x-200)*5.80;
			System.out.println("The elecricity bill is "+d);
		}
		else if(a>400) {
			double e = 50*3 + (a-50)*4.80 + (a-200)*5.80 + (a-400)*6.20;
			System.out.println("The elecricity bill is "+e);
		}

	}

}
