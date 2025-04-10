package model;

public class Calculator {
    public double somar(double a, double b) {
        return a + b;
    }
    public double subtrair(double a, double b) {
        return a - b;
    }
    public double multiplicar(double a, double b) {
        return a * b;
    }
    public double dividir(double a, double b) {
        if (b == 0) throw new ArithmeticException("Divisão por zero");
        double resultado = a / b;
        return Math.round(resultado * 100.0) / 100.0;

    }
}

