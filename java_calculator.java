import java.util.Scanner;

public class java_calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Simple Calculator");

        
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        
        System.out.print("Enter operation (+, -, *): ");
        char op = input.next().charAt(0);

        double result = 0;

       
        if(op == '+') result = num1 + num2;
        else if(op == '-') result = num1 - num2;
        else if(op == '*') result = num1 * num2;
        else System.out.println("Invalid operation!");

        System.out.println("Result: " + result);
    }
}
