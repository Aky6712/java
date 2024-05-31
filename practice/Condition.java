import java.util.Scanner;

public class Condition {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        /*int age = sc.nextInt();

        if(age>18)
        {
            System.out.println("Adult");
        
        }
        else{
            System.out.println("NOt Adult");
        }*/
        /*int num = sc.nextInt();

        if(num%2==0)
        {
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }*/

        /*int button = sc.nextInt();
        

        if(button==1)
        {
            System.out.println("Hello");
        }
        else if(button==2)
            {
                System.out.println("Namste");
            }
        else if(button==3)
            {
                System.out.println("Banjour");
            }
        else{
                System.out.println("Invalid Button");

            }*/
            int button = sc.nextInt();

        switch(button)
        {
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namste");
            break;
            case 3 : System.out.println("Banjour");
            break;
            default : System.out.println("Invalid button");

        }    

        



    }
}