public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two numbers as arguments.");
            return;
        }

        try {
            int number1 = Integer.parseInt(args[0]);
            int number2 = Integer.parseInt(args[1]);

            int multiplication = number1 * number2;
            int division = number2 != 0 ? number1 / number2 : 0;

            System.out.println("Multiplication Result: " + multiplication);
            if (number2 != 0) {
                System.out.println("Division Result: " + division);
            } else {
                System.out.println("Division by zero is not allowed!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        }
    }
}
