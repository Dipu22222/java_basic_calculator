# Java Basic Calculator

**Name:** Dipu Mondol  
**ID:** IT-24040

## Description

A simple calculator program in Java that performs basic arithmetic operations. The program takes two numbers as input from the user and performs addition, subtraction, or multiplication based on the user's choice of operation.

## Features

- Addition (+)
- Subtraction (-)
- Multiplication (*)
- User-friendly input prompts
- Error handling for invalid operations

## Code

```java
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
```

## How to Run

1. Save the code as `java_calculator.java`
2. Compile: `javac java_calculator.java`
3. Run: `java java_calculator`

## Sample Output

```
Welcome to Simple Calculator
Enter first number: 10
Enter second number: 5
Enter operation (+, -, *): +
Result: 15.0
```

## Sample Output (Multiplication)

```
Welcome to Simple Calculator
Enter first number: 8
Enter second number: 4
Enter operation (+, -, *): *
Result: 32.0
```

## Sample Output (Invalid Operation)

```
Welcome to Simple Calculator
Enter first number: 10
Enter second number: 5
Enter operation (+, -, *): /
Invalid operation!
Result: 0.0
```
