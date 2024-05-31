import java.util.*;

public class bonus {
        
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Salary : ");
        int salary = sc.nextInt();
        System.out.print("\n\nEnter the number of year you worked : ");
        int year = sc.nextInt();
        //int i =1;
        if(year>5)
        {
            System.out.print("\n\nyou Get a bonus " + (.5*salary));
        }

        else
        {
            System.out.print("\n\n You will get bonus after " + (5-year));
        }


    }
}
