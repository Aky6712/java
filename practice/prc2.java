import java.util.*;
public class prc2 {
   public static void main(String[] args) {
    int n=3;
//outer
   /*  for(int i=1; i<=n; i++)
    {
//inner
        for(int j=1; j<=n-i; j++)
        {
            System.out.print(" ");
        }
//space
        for(int j=1; j<=2*i-1; j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }*/

    for(int i=n; i>=1; i--)
    {
//inner
        for(int j=1; j<=n-i; j++)
        {
            System.out.print(" ");
        }
//space
        for(int j=1; j<=2*i-j; j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
     
   }
    
}
