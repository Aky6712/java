package Demo;
import java.util.*;
public class userLogin {
	public static void main(String[] args) {
	 Scanner sc = new Scanner (System.in);
	 
	 String user, pass;
	 System.out.println("Enter Username : ");
	 user = sc.nextLine();
	 System.out.println("Enter Password : ");
	 pass = sc.nextLine();
	 if(user.equals("admin") && pass.equals("admin"))
	 {
		System.out.println("Welcome Back");
	 }
	 else{
		System.out.println("Wrong Username and password!!!");
	 }
	sc.close();
	}

}
