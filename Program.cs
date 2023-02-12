namespace Calculator;
class Operators {
    public double Addition(double a, double b) {
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
    public double Subtraction(double a, double b) {
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
    public double Multiplication(double a, double b) {
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
    public double Division(double a, double b) {
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

public class Program {
    public static void Main(string[] args) {
        Operators operators = new Operators();
        String message, option, inputA, inputB;
        
        message = "\nInteractive commandline calculator!\nchoose one option:\n1. calculator\n2. exit\noption: ";

        Console.Write(message);
        option = Console.ReadLine();

        switch (option) {
            case "1":
                message = "Operators:\n1. Addition\n2. subtraction\n3. multiplication\n4. division\n5. exit\noption: ";
                Console.Write(message);
                option = Console.ReadLine();
                
                switch (option) {
                    case "1":
                        message = "Enter first number: ";
                        Console.Write(message);
                        inputA = Console.ReadLine();
                        message = "Enter second number: ";
                        Console.Write(message);
                        inputB = Console.ReadLine();
                        Console.WriteLine(operators.Addition(Double.Parse(inputA), Double.Parse(inputB)));
                        break;
                    case "2":
                        message = "Enter first number: ";
                        Console.Write(message);
                        inputA = Console.ReadLine();
                        message = "Enter second number: ";
                        Console.Write(message);
                        inputB = Console.ReadLine();
                        Console.WriteLine(operators.Subtraction(Double.Parse(inputA), Double.Parse(inputB)));
                        break;
                    case "3":
                        message = "Enter first number: ";
                        Console.Write(message);
                        inputA = Console.ReadLine();
                        message = "Enter second number: ";
                        Console.Write(message);
                        inputB = Console.ReadLine();
                        Console.WriteLine(operators.Multiplication(Double.Parse(inputA), Double.Parse(inputB)));
                        break;
                    case "4":
                        message = "Enter first number: ";
                        Console.Write(message);
                        inputA = Console.ReadLine();
                        message = "Enter second number: ";
                        Console.Write(message);
                        inputB = Console.ReadLine();
                        Console.WriteLine(operators.Division(Double.Parse(inputA), Double.Parse(inputB)));
                        break;
                    case "5":
                        message = "Thank you for using calculator!";
                        Console.WriteLine(message);
                    break;
                }
            break;
            case "2":
            break;
        }
    }
}
