package PavithraPro;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double number = sc.nextDouble();

        System.out.println("Enter second number: ");
        double number2 = sc.nextDouble();

        System.out.println("Choose operation: +, -, *, /");
        char op = sc.next().charAt(0);

        double result;

        switch(op) {
            case '+':
                result = number + number2;
                break;

            case '-':
                result = number - number2;
                break;

            case '*':
                result = number * number2;
                break;

            case '/':
                if(number2 != 0)
                    result = number / number2;
                else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;

            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}