import java.util.*;
public class swaping {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for a : ");
        int a = sc.nextInt();

        System.out.print("Enter value of b : ");
        int b = sc.nextInt();

        System.out.println("\n\nValue of a is " + a);
        System.out.println("Value of b is " + b);

        int c = a;
        a=b;
        b=c;

        System.out.println("\n\n\nValue of a after swapping : "+a);
        System.out.println("Value of b after swapping : "+b);

    }


}
