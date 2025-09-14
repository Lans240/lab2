package ru.miet.testing;

public class CalculatorViewImpl implements CalculatorView {

    private String firstArgument;
    private String secondArgument;

    public CalculatorViewImpl(String firstArgument, String secondArgument) {
        this.firstArgument = firstArgument;
        this.secondArgument = secondArgument;
    }

    /**
     * Отображает результат вычисления
     * Здесь нужно вывести результат в консоль или GUI.
     */
    @Override
    public void printResult(double result) {
        // Например, выводим результат в консоль
        System.out.println("Результат: " + result);
    }

    /**
     * Показывает ошибку, например деление на 0, пустые аргументы и прочее
     * Здесь нужно вывести сообщение об ошибке в консоль или GUI.
     */
    @Override
    public void displayError(String message) {
        // Например, выводим ошибку в консоль
        System.err.println("Ошибка: " + message);
    }

    /**
     * Возвращает значение, введенное в поле первого аргументы
     * Здесь нужно вернуть строку, введённую пользователем.
     */
    @Override
    public String getFirstArgumentAsString() {
        // Возвращаем сохранённое значение первого аргумента
        return firstArgument;
    }

    /**
     * Возвращает значение, введенное в поле второго аргументы
     * Здесь нужно вернуть строку, введённую пользователем.
     */
    @Override
    public String getSecondArgumentAsString() {
        // Возвращаем сохранённое значение второго аргумента
        return secondArgument;
    }
}