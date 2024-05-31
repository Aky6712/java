import java.util.*;
public class factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int factorial = calculateFactorial(num);
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
    
    public static int calculateFactorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * calculateFactorial(n - 1);

	}

}
