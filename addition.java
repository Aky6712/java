package Demo;
import java.util.*;

public class addition {
	public static void main (String[] args) {
		int a; int b;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the 1st number : ");
	a = sc.nextInt();
	
	System.out.print("Enter the 2st number : ");
	b = sc.nextInt();
	
		System.out.println("Addition of a and b is :  "+(a+b));
		sc.close();
	}
}
