import java.util.Scanner;

public class calcswitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a :");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        int add = a+b;
        int sub = a-b;
        int mult = a*b;
        int div = a/b;
        int mod = a%b;
        System.out.println("add : "+add);
        System.out.println("sub : "+sub);
        System.out.println("mult : "+mult);
        System.out.println("div : "+div);
        System.out.println("mod : 6"+mod);
        /*System.out.println("Enter number for perform operation \n 1.Add \n 2.Sub \n 3.multi \n 4.divison \n 5.module ");
        int choose = sc.nextInt();
        switch(choose)
        {
        case 1 : ;
        break;
        case 2 : int sub = a-b;
        break;
        case 3 : int mult = a*b;
        break;
        case 4 : int div = a/b;
        break;
        case 5 : int mod = a%b;
        break;
        default : System.out.println("Invailed choice");
        
            
        }*/



        
    }
    
}
