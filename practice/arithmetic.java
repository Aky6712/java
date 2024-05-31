import java.util.*;
public class arithmetic {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter value of a :");
        int a = sc.nextInt();

        System.out.print("Enter value of b :");
        int b = sc.nextInt();

        System.out.println("Choose any operator : \n 1. + \n 2. - \n 3. * \n 4. / ");
        int operators = sc.nextInt();

        switch(operators)
        {
            case 1 : System.out.print("Addition of a and b is "+ (a+b));
            break;

            case 2 : System.out.print("Subtraction of a and b is "+ (a-b));
            break;

            case 3 : System.out.print("Multiplication of a and b is "+ (a*b));
            break;

            case 4 : 
            if(b==0)
            {
                System.out.println("Invalid divison");
            }
            else
            {
            System.out.print("Division of a and b is "+ (a/b));
            }
            break;

            default:System.out.println("Invalid Operator");



        }


    }
    
}
