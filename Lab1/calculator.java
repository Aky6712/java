import java.util.*;
public class calculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an expression: ");
        String expression = scanner.nextLine();
        
        double result = evaluateExpression(expression);
        System.out.println("Result: " + result);
    }
    
    public static double evaluateExpression(String expression) {
        
        String[] parts = expression.split(" ");
        double operand1 = Double.parseDouble(parts[0]);
        String operator = parts[1];
        double operand2 = Double.parseDouble(parts[2]);
        
        double result = 0;
        switch(operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                result = operand1 / operand2;
                break;
            default:
                System.out.println("Invalid operator");
        }
        return result;
    }
}
