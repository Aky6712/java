package Demo;
import java.util.*;
public class AreaOfCircleUSer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userResp;
		
		do {
			System.out.print("Enter the radius of the Circle :");
			double radius = sc.nextDouble();
			
			double area= Math.PI*radius*radius;
			
			System.out.print("The area of circle is : "+area+"\n");
			
			System.out.print("Do you want to calculate area of another circle? (Enter YES to continue ) : ");
			userResp = sc.next();
			
		}while(userResp.equalsIgnoreCase("YES"));
		
		sc.close();
		System.out.print("Thank you for using the Circle Are Calculator!");
	}

}
