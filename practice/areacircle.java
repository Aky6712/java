import java.util.*;

public class areacircle{

    public static void main (String[] args)
    {

        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        System.out.print("Enter the value of Radius : ");
        int r = sc.nextInt();

        //Area of Circle 
        double acircle = pi*r*r;
        System.out.print("\n Area Circle is : " + acircle);

        //Area of Perimeter
        double pcircle = 2*pi*r;
        System.out.print("\n\n Area of Perimeter is : "+ pcircle);


    }
}