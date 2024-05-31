import java.util.*;
public class facto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact =1;

        System.out.print("Enter any Number to find Factorial : ");
        int n = sc.nextInt();
        
        if (n<0)
        {
            System.out.print("Factorial is not exist of Negative Numner. ");
        }
      
        else
        {
         for (int i=1; i<=n; i++)
            {
                fact = fact * i;
            }
        System.out.print("Factorial of " + n +" is " + fact);
        }

        
    }
    
}
