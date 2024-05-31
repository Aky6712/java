import java.util.*;



public class Absolutevalue {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        if(n<0)
        {
            System.out.print("Absolute value : "+(-1*n));
        }
        else
        {
            System.out.print("absolute value : "+n);
        }
    }
    
}
