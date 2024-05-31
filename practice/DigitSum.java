public class DigitSum {
    public static void main(String[] args) {
        int number = 38154;
        System.out.println("The original number is: " + number);
        int result = sumDigitsUntilSingleDigit(number);
        System.out.println("The single-digit sum is: " + result);
    }

    public static int sumDigitsUntilSingleDigit(int number) {
        // Loop until number is a single digit
        while (number >= 10) {
            number = sumOfDigits(number);
        }
        return number;
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10; // Add the last digit
            number /= 10; // Remove the last digit
        }
        return sum;
    }
}
