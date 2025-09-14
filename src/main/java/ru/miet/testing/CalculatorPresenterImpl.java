package ru.miet.testing;

public class CalculatorPresenterImpl implements CalculatorPresenter {
    private final Calculator calculator;
    private final CalculatorView view;

    public CalculatorPresenterImpl(Calculator calculator, CalculatorView view) {
        this.calculator = calculator;
        this.view = view;
    }

    private Double parseArgument(String arg) {
        try {
            return Double.parseDouble(arg);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    @Override
    public void onPlusClicked() {
        Double a = parseArgument(view.getFirstArgumentAsString());
        Double b = parseArgument(view.getSecondArgumentAsString());
        if (a == null || b == null) {
            view.displayError("Некорректный ввод аргументов");
            return;
        }
        double result = calculator.sum(a, b);
        view.printResult(result);
    }

    @Override
    public void onMinusClicked() {
        Double a = parseArgument(view.getFirstArgumentAsString());
        Double b = parseArgument(view.getSecondArgumentAsString());
        if (a == null || b == null) {
            view.displayError("Некорректный ввод аргументов");
            return;
        }
        double result = calculator.subtract(a, b);
        view.printResult(result);
    }

    @Override
    public void onDivideClicked() {
        Double a = parseArgument(view.getFirstArgumentAsString());
        Double b = parseArgument(view.getSecondArgumentAsString());
        if (a == null || b == null) {
            view.displayError("Некорректный ввод аргументов");
            return;
        }
        try {
            double result = calculator.divide(a, b);
            view.printResult(result);
        } catch (ArithmeticException e) {
            view.displayError("Деление на ноль невозможно");
        }
    }

    @Override
    public void onMultiplyClicked() {
        Double a = parseArgument(view.getFirstArgumentAsString());
        Double b = parseArgument(view.getSecondArgumentAsString());
        if (a == null || b == null) {
            view.displayError("Некорректный ввод аргументов");
            return;
        }
        double result = calculator.multiply(a, b);
        view.printResult(result);
    }
}