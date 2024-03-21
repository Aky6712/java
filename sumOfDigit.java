import java.util.*;
public class sumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input an Integer: ");
        long n = sc.nextLong();

        System.out.println("The sum of Digit is : "+ sumDigit(n));
    }

    public static int sumDigit(long n) {
    int sum = 0;

    while(n != 0)
    {
        sum += n%10;
        n /= 10;
    }

    return sum;
    }
}
