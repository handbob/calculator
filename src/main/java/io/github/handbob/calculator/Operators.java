package io.github.handbob.calculator;

public class Operators {
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
