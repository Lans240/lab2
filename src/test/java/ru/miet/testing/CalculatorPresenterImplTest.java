package ru.miet.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

class CalculatorPresenterImplTest {

    private Calculator calculator;
    private CalculatorView view;
    private CalculatorPresenterImpl presenter;

    @BeforeEach
    void setUp() {
        calculator = mock(Calculator.class);
        view = mock(CalculatorView.class);
        presenter = new CalculatorPresenterImpl(calculator, view);
    }

    @Test
    void testOnPlusClicked_validArgs() {
        when(view.getFirstArgumentAsString()).thenReturn("2.5");
        when(view.getSecondArgumentAsString()).thenReturn("3.5");
        when(calculator.sum(2.5, 3.5)).thenReturn(6.0);

        presenter.onPlusClicked();

        verify(view).printResult(6.0);
        verify(view, never()).displayError(anyString());
    }

    @Test
    void testOnPlusClicked_invalidArgs() {
        when(view.getFirstArgumentAsString()).thenReturn("abc");
        when(view.getSecondArgumentAsString()).thenReturn("3.5");

        presenter.onPlusClicked();

        verify(view).displayError("Некорректный ввод аргументов");
        verify(view, never()).printResult(anyDouble());
    }

    @Test
    void testOnPlusClicked_emptyArgs() {
        when(view.getFirstArgumentAsString()).thenReturn("");
        when(view.getSecondArgumentAsString()).thenReturn("");

        presenter.onPlusClicked();

        verify(view).displayError("Некорректный ввод аргументов");
        verify(view, never()).printResult(anyDouble());
    }

    @Test
    void testOnMinusClicked_validArgs() {
        when(view.getFirstArgumentAsString()).thenReturn("5");
        when(view.getSecondArgumentAsString()).thenReturn("2");
        when(calculator.subtract(5.0, 2.0)).thenReturn(3.0);

        presenter.onMinusClicked();

        verify(view).printResult(3.0);
        verify(view, never()).displayError(anyString());
    }

    @Test
    void testOnMinusClicked_invalidArgs() {
        when(view.getFirstArgumentAsString()).thenReturn("");
        when(view.getSecondArgumentAsString()).thenReturn("2");

        presenter.onMinusClicked();

        verify(view).displayError("Некорректный ввод аргументов");
        verify(view, never()).printResult(anyDouble());
    }

    @Test
    void testOnMinusClicked_bothInvalidArgs() {
        when(view.getFirstArgumentAsString()).thenReturn("abc");
        when(view.getSecondArgumentAsString()).thenReturn("xyz");

        presenter.onMinusClicked();

        verify(view).displayError("Некорректный ввод аргументов");
        verify(view, never()).printResult(anyDouble());
    }

    @Test
    void testOnMultiplyClicked_validArgs() {
        when(view.getFirstArgumentAsString()).thenReturn("2");
        when(view.getSecondArgumentAsString()).thenReturn("4");
        when(calculator.multiply(2.0, 4.0)).thenReturn(8.0);

        presenter.onMultiplyClicked();

        verify(view).printResult(8.0);
        verify(view, never()).displayError(anyString());
    }

    @Test
    void testOnMultiplyClicked_invalidArgs() {
        when(view.getFirstArgumentAsString()).thenReturn("2");
        when(view.getSecondArgumentAsString()).thenReturn("xyz");

        presenter.onMultiplyClicked();

        verify(view).displayError("Некорректный ввод аргументов");
        verify(view, never()).printResult(anyDouble());
    }

    @Test
    void testOnMultiplyClicked_emptyArgs() {
        when(view.getFirstArgumentAsString()).thenReturn("");
        when(view.getSecondArgumentAsString()).thenReturn("");

        presenter.onMultiplyClicked();

        verify(view).displayError("Некорректный ввод аргументов");
        verify(view, never()).printResult(anyDouble());
    }

    @Test
    void testOnDivideClicked_validArgs() {
        when(view.getFirstArgumentAsString()).thenReturn("10");
        when(view.getSecondArgumentAsString()).thenReturn("2");
        when(calculator.divide(10.0, 2.0)).thenReturn(5.0);

        presenter.onDivideClicked();

        verify(view).printResult(5.0);
        verify(view, never()).displayError(anyString());
    }

    @Test
    void testOnDivideClicked_invalidArgs() {
        when(view.getFirstArgumentAsString()).thenReturn("10");
        when(view.getSecondArgumentAsString()).thenReturn("abc");

        presenter.onDivideClicked();

        verify(view).displayError("Некорректный ввод аргументов");
        verify(view, never()).printResult(anyDouble());
    }

    @Test
    void testOnDivideClicked_divideByZero() {
        when(view.getFirstArgumentAsString()).thenReturn("10");
        when(view.getSecondArgumentAsString()).thenReturn("0");
        when(calculator.divide(10.0, 0.0)).thenThrow(new ArithmeticException());

        presenter.onDivideClicked();

        verify(view).displayError("Деление на ноль невозможно");
        verify(view, never()).printResult(anyDouble());
    }

    @Test
    void testOnDivideClicked_bothInvalidArgs() {
        when(view.getFirstArgumentAsString()).thenReturn("abc");
        when(view.getSecondArgumentAsString()).thenReturn("xyz");

        presenter.onDivideClicked();

        verify(view).displayError("Некорректный ввод аргументов");
        verify(view, never()).printResult(anyDouble());
    }

    @Test
    void testOnDivideClicked_emptyArgs() {
        when(view.getFirstArgumentAsString()).thenReturn("");
        when(view.getSecondArgumentAsString()).thenReturn("");

        presenter.onDivideClicked();

        verify(view).displayError("Некорректный ввод аргументов");
        verify(view, never()).printResult(anyDouble());
    }

    @Test
    void testOnPlusClicked_negativeNumbers() {
        when(view.getFirstArgumentAsString()).thenReturn("-2.5");
        when(view.getSecondArgumentAsString()).thenReturn("-3.5");
        when(calculator.sum(-2.5, -3.5)).thenReturn(-6.0);

        presenter.onPlusClicked();

        verify(view).printResult(-6.0);
        verify(view, never()).displayError(anyString());
    }

    @Test
    void testOnMinusClicked_negativeNumbers() {
        when(view.getFirstArgumentAsString()).thenReturn("-5");
        when(view.getSecondArgumentAsString()).thenReturn("-2");
        when(calculator.subtract(-5.0, -2.0)).thenReturn(-3.0);

        presenter.onMinusClicked();

        verify(view).printResult(-3.0);
        verify(view, never()).displayError(anyString());
    }

    @Test
    void testOnMultiplyClicked_negativeNumbers() {
        when(view.getFirstArgumentAsString()).thenReturn("-2");
        when(view.getSecondArgumentAsString()).thenReturn("4");
        when(calculator.multiply(-2.0, 4.0)).thenReturn(-8.0);

        presenter.onMultiplyClicked();

        verify(view).printResult(-8.0);
        verify(view, never()).displayError(anyString());
    }

    @Test
    void testOnDivideClicked_negativeNumbers() {
        when(view.getFirstArgumentAsString()).thenReturn("-10");
        when(view.getSecondArgumentAsString()).thenReturn("-2");
        when(calculator.divide(-10.0, -2.0)).thenReturn(5.0);

        presenter.onDivideClicked();

        verify(view).printResult(5.0);
        verify(view, never()).displayError(anyString());
    }

    @Test
    void testOnDivideClicked_zeroDividend() {
        when(view.getFirstArgumentAsString()).thenReturn("0");
        when(view.getSecondArgumentAsString()).thenReturn("5");
        when(calculator.divide(0.0, 5.0)).thenReturn(0.0);

        presenter.onDivideClicked();

        verify(view).printResult(0.0);
        verify(view, never()).displayError(anyString());
    }

    @Test
    void testOnDivideClicked_verySmallDivisor() {
        when(view.getFirstArgumentAsString()).thenReturn("10");
        when(view.getSecondArgumentAsString()).thenReturn("1e-9");
        when(calculator.divide(10.0, 1e-9)).thenThrow(new ArithmeticException());

        presenter.onDivideClicked();

        verify(view).displayError("Деление на ноль невозможно");
        verify(view, never()).printResult(anyDouble());
    }
    
}