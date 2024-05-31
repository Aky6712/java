public class SquareAndCube {
    public static void main(String[] args) {
        // Define the numbers
        int[] numbers = {2, 3, 4};

        // Calculate and print the squares and cubes
        for (int number : numbers) {
            int square = number * number;
            int cube = number * number * number;
            System.out.println(square);
            System.out.println(cube);
        }
    }
}
