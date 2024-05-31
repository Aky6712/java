import java.util.*;
public class dowhilemarks {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int input;
    do{
        System.out.println("Enter marks : ");
        int mar = sc.nextInt();
        if(mar >= 90 && mar <= 100)
        {
            System.out.println("This is good");
        }
        else if (mar >= 60 && mar <= 89)
        {
            System.out.println("This is also good");
        }
        else if ( mar >= 0 && mar <= 59)
        {
            System.out.println("This is good as well");
        }
        else
        {
            System.out.println("Invalid ");
        }

        System.out.println("wants to continue ? yes(1) or NO (0) .");
        input = sc.nextInt();



    }
    while(input == 1);

    }
    
}
