import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter your electricity unit");
        double a = sc.nextDouble();
        double x = a-50;
        double y = a-200;
        double b = 3*a;
        double c = 50*3 + (a-50)*4.80;
        double d = 50*3 + (a-50)*4.80 + (x-200)*5.80;
        double e = 50*3 + (a-50)*4.80 + (x-200)*5.80 + (y-400)*6.20;

        System.out.print("Do you want to pay online(y/n): ");
        char o = sc.next().charAt(0);
        if(o=='y') {
            if(a<=50) {
                System.out.println("Total amount: "+b);
                double dis = b*0.03;
                System.out.println("Discount: "+dis);
                double ap = b-dis;
                System.out.println("Amount payable: "+ap);
            }
            else if (a>50 && a<=200) {
                System.out.println("Total amount: "+c);
                double dis = c*0.03;
                System.out.println("Discount: "+dis);
                double ap = c-dis;
                System.out.println("Amount payable: "+ap);
            }
            else if(a>200 && a<=400) {
                System.out.println("Total amount: "+d);
                double dis = d*0.03;
                System.out.println("Discount: "+dis);
                double ap = d-dis;
                System.out.println("Amount payable: "+ap);
            }
            else if(a>400) {
                System.out.println("Total amount: "+e);
                double dis = e*0.03;
                System.out.println("Discount: "+dis);
                double ap = e-dis;
                System.out.println("Amount payable: "+ap);
            }

        }
        else {
            if(a<=50)    System.out.println("The electricity bill is "+b);
            else if (a>50 && a<=200)    System.out.println("The electricity bill is "+c);
            else if(a>200 && a<=400)    System.out.println("The electricity bill is "+d);
            else if(a>400)  System.out.println("The electricity bill is "+e);
        }

	}

}
