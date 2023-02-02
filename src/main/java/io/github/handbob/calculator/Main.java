package io.github.handbob.calculator;

import java.util.Scanner;

class Operators {
    public double addition(double a, double b) {
        double c = 0;
        if (a < 0) {
            c = (a * (-1)) + b;
        }
        else if (b < 0) {
            c = a + (b * (-1));
        }
        else {
            c = a + b;
        }
        return c;
    }
    public double subtraction(double a, double b) {
        double c = 0;
        if (a < 0) {
            c = (a * (-1)) - b;
        }
        else if (b < 0) {
            c = a - (b * (-1));
        }
        else {
            c = a - b;
        }
        return c;
    }
    public double multiplication(double a, double b) {
        double c = 0;
        if (a < 0) {
            c = (a * (-1)) * b;
        }
        else if (b < 0) {
            c = a * (b * (-1));
        }
        else {
            c = a * b;
        }
        return c;
    }
    public double division(double a, double b) {
        double c = 0;
        if (a < 0) {
            c = (a * (-1)) / b;
        }
        else if (b < 0) {
            c = a / (b * (-1));
        }
        else {
            c = a / b;
        }
        return c;
    }
}


public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String message = new String();
            String option = new String();
            Operators operators = new Operators();
            String inputA = new String();
            String inputB = new String();
            
            message = "\nInteractive commandline calculator!\nchoose one option:\n1. calculator\n2. exit\noption: ";

            System.out.printf("%s", message);
            option = scanner.nextLine();
            switch (option) {
                case "1":
                    message = "Operators:\n1. addition\n2. subtraction\n3. multiplication\n4. division\n5. exit\noption: ";
                    System.out.printf("%s", message);
                    option = scanner.nextLine();
                    switch (option) {
                        case "1":
                            message = "Enter first number: ";
                            System.out.printf("%s", message);
                            inputA = scanner.nextLine();
                            message = "Enter second number: ";
                            System.out.printf("%s", message);
                            inputB = scanner.nextLine();
                            System.out.printf("%.2f\n", operators.addition(Double.parseDouble(inputA), Double.parseDouble(inputB)));
                            break;
                        case "2":
                            message = "Enter first number: ";
                            System.out.printf("%s", message);
                            inputA = scanner.nextLine();
                            message = "Enter second number: ";
                            System.out.printf("%s", message);
                            inputB = scanner.nextLine();
                            System.out.printf("%.2f\n", operators.addition(Double.parseDouble(inputA), Double.parseDouble(inputB)));
                            break;
                        case "3":
                            message = "Enter first number: ";
                            System.out.printf("%s", message);
                            inputA = scanner.nextLine();
                            message = "Enter second number: ";
                            System.out.printf("%s", message);
                            inputB = scanner.nextLine();
                            System.out.printf("%.2f\n", operators.addition(Double.parseDouble(inputA), Double.parseDouble(inputB)));
                            break;
                        case "4":
                            message = "Enter first number: ";
                            System.out.printf("%s", message);
                            inputA = scanner.nextLine();
                            message = "Enter second number: ";
                            System.out.printf("%s", message);
                            inputB = scanner.nextLine();
                            System.out.printf("%.2f\n", operators.addition(Double.parseDouble(inputA), Double.parseDouble(inputB)));
                            break;
                        case "5":
                            message = "Thank you for using calculator!";
                            System.out.printf("%s\n", message);
                            break;
                        }
                    break;
                case "2":
                    break;
            }
        }
    }
}
