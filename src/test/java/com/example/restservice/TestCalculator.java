package com.example.restservice;


import com.example.restservice.Calculator.OPERATION;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
public class TestCalculator {
    private Calculator calculator;
    @Test
    public void test1() throws Exception {
        calculator = new Calculator(OPERATION.ADD);
        assertEquals(15, calculator.calculate(10, 5));
    }
    @Test
    public void test2() throws Exception {
        calculator = new Calculator(OPERATION.SUBTRACT);
        assertEquals(5, calculator.calculate(10, 5));
    }
    @Test
    public void test3() throws Exception {
        calculator = new Calculator(OPERATION.DIVIDE);
        assertEquals(2, calculator.calculate(10, 5));
    }
    @Test
    public void test4() throws Exception {
        calculator = new Calculator(OPERATION.MULTIPLY);
        assertEquals(50, calculator.calculate(10, 5));
    }
}
