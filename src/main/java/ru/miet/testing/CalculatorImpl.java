package ru.miet.testing;

public class CalculatorImpl implements Calculator {

    /**
     * Вычисляет сумму двух чисел
     */
    @Override
    public double sum(double a, double b) {
        return a + b;
    }

    /**
     * Вычисляет разность двух чисел a - b
     */
    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Вычисляет произведение двух чисел
     */
    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Вычисляет отношение числа а к числу b.
     * Должен выбросить {@link java.lang.ArithmeticException} если |b| < 10e-8
     */
    @Override
    public double divide(double a, double b) {
        if (Math.abs(b) < 1e-8) {
            throw new ArithmeticException("Divider is too close to zero");
        }
        return a / b;
    }
}