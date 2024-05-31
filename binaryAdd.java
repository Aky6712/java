import java.util.*;
public class binaryAdd {
    public static void main(String[] args){
        long b1, b2;
        int i =0, rem = 0;

        int[] sum = new int[20];
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 1st binary number: ");
        b1 = in.nextLong();

        System.out.println("Enter 1st binary number: ");
        b2 = in.nextLong();

        while(b1 != 0 || b2 != 0)
        {
            sum[i++] = (int)((b1%10 + b2%10 + rem)%2);
            rem = (int)((b1%10 + b2%10 + rem)/2);
            b1 = b1/10;
            b2 = b2/10;
        }

        if (rem != 0){
            sum[i++] = rem;
        }

      --i;
      
      System.out.print("sum od two binary numbers: ");
      while(i >= 0){
        System.out.print(sum[i--]);
      }
      System.out.print("\n");
    }
}
