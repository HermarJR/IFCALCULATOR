import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        double result;
        int operator;

        boolean validOperator = false;

        System.out.println("Enter First Number: ");
        num1 = scanner.nextDouble();
        System.out.println("Enter Second Number: ");
        num2 = scanner.nextDouble();

        while (!validOperator) {
            System.out.println("Enter your Operator: ");
            System.out.println("1. +");
            System.out.println("2. -");
            System.out.println("3. *");
            System.out.println("4. /");
            System.out.println("5. %");

            operator = scanner.nextInt();
            System.out.println();

            if (operator >= 1 && operator <= 5) {
                validOperator = true;
                if (operator == 1) {
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                } else if (operator == 2) {
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                } else if (operator == 3) {
                    result = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result);
                } else if (operator == 4) {
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + result);
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                } else if (operator == 5) {
                    result = num1 % num2;
                    System.out.println(num1 + " % " + num2 + " = " + result);
                }
            } else {
                System.out.println("Wrong Operator!!! Please enter a valid operator (1-5).");
            }
        }

        System.out.println("Thank you for using!");

        scanner.close();
    }
}
