public class VotingEligibility {
    public static void main(String[] args) {
        // Declare and initialize the variables
        int age = 25;
        int vage = 18;

        // Compare age with the voting age limit
        if (age >= vage) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }
    }
}