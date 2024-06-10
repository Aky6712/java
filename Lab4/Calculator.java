class Calculator {
    public int add(int a, int b) {
      return a + b;
    }

    public double add(double a, double b) {
      return a + b;
    }

    public int add(int a, int b, int c) {
      return a + b + c;
    }

    public int add(int... numbers) {
      int sum = 0;
      for (int num : numbers) {
        sum += num;
      }
      return sum;
    }

public static void main(String[] args) {
    Calculator calculator = new Calculator();

    int sum1 = calculator.add(15, 2);
    double sum2 = calculator.add(2.5, 3.9);
    int sum3 = calculator.add(1, 2, 3);
    int sum4 = calculator.add(1, 13, 24, 9);

    System.out.println("Sum of 5 and 3 (int): " + sum1);
    System.out.println("Sum of 5.5 and 3.2 (double): " + sum2);
    System.out.println("Sum of 1, 2, and 3 (int): " + sum3);
    System.out.println("Sum of variable integers: " + sum4);
  }
}
