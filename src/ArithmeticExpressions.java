// Main class
public class ArithmeticExpressions {

    // Main method
    public static void main(String[] args) {
        // Basic operations
        int a = 10;
        int b = 5;

        System.out.println("Sum: " + add(a, b)); // 10 + 5 = 15
        System.out.println("Subtraction: " + subtract(a, b)); // 10 - 5 = 5
        System.out.println("Multiplication: " + multiply(a, b)); // 10 * 5 = 50
        System.out.println("Division: " + divide(a, b)); // 10 / 5 = 2

        // Complex operation using abstraction
        System.out.println("Complex Operation (a * b + a / b): " + calculateComplexOperation(a, b)); // (10 * 5) + (10 / 5) = 50 + 2 = 52
    }

    // Methods for basic operations
    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int divide(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }

    // Method for complex operation
    public static int calculateComplexOperation(int x, int y) {
        return (x * y) + (x / y);
    }
}
