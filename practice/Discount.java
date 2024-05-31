import java.util.*;
public class Discount {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the quantity you : ");
        int qnt = sc.nextInt();

        if((qnt*100)>1000)
        {
            System.out.print("You get discount of "+(.1*qnt*100)+" and your total cost is "+(qnt*100-(.1*qnt*100)));
        }
        else
        {
            System.out.println("No discount because Total amount is less less then 1000");
            System.out.print("Yout total cost is "+ (qnt*100) +".");


        }

    }
    
}
