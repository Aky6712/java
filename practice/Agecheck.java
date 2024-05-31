import java.util.*;

public class Agecheck{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter age 'A' : ");
        int a = sc.nextInt();
        System.out.print("Enter age 'B' : ");
        int b = sc.nextInt();
        System.out.print("Enter age 'C' : ");
        int c = sc.nextInt();

        if ((a>b) && (a>c))
        {
            System.out.print("A is older.");

        }
        
        else if ((b>a) && (b>c))
        {
            System.out.print("B is older.");

        }

        else if ((c>b) && (c>a))
        {
            System.out.print("C is older.");

        }

        else 
        {
        
            System.out.print("All are Equal.");
        }

    }
}