import java.util.*;

public class vowel {
    public static void main (String[] args)
    {

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter any Letter : ");
        char l = sc.next().charAt(0);
        
        if(l=='a' || l=='e' || l=='i' || l == 'o' || l=='u' || l=='A' || l=='E' || l=='I' || l == 'O' || l=='U' )
        {
         System.out.print("The "+ l + " is vowel. ");
        }
        else if (l=='b' || l=='c' || l=='d' || l == 'f' || l=='g' ||l=='h' || l=='j' || l=='k' || l == 'l' || l=='m' ||
        l=='n' || l=='p' || l=='q' || l == 'r' || l=='s' || l=='t' || l=='v' || l=='w' || l == 'x' || l=='y' ||l=='z' || 
        l=='B' || l=='C' || l=='D' || l == 'F' || l=='G' ||l=='H' || l=='J' || l=='K' || l == 'L' || l=='M' ||
        l=='N' || l=='P' || l=='Q' || l == 'R' || l=='S' || l=='T' || l=='V' || l=='W' || l == 'X' || l=='Y' ||l=='Z')
        {
            System.out.print("The " + l + " is Consonant");
        }

        else {
            System.out.println("Invalid character.");
        }
    }

}
