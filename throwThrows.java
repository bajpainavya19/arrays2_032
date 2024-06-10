package Core;

// Custom exception for handling negative radius
class NegativeRadiusException extends Exception {
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}

public class throwThrows {

    // Method to calculate the area of a circle, throws NegativeRadiusException
    public static double area(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException();
        }
        return Math.PI * r * r;
    }

    // Method to divide two integers, throws ArithmeticException
    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            int c = divide(6, 0); // This will throw an ArithmeticException
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }

        try {
            double ar = area(6); // This will not throw an exception
            System.out.println(ar);

            double arNegative = area(-1); // This will throw NegativeRadiusException
            System.out.println(arNegative);
        } catch (NegativeRadiusException e) {
            System.out.println("NegativeRadiusException: " + e.getMessage());
        }

        System.out.println("Program ends here.");
    }
}
