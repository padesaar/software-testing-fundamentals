package org.example.calculator;

import org.example.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SuctractCalculatorTest {

    @Test
   public void shouldReturnToResultAfterSubtractArrayIsCalled() {

        float[] array = {34, 2, 6.7f, 2.3f, 7};

        Calculator calculator = new Calculator();
        float result = calculator.subtractArray(array);

        Assertions.assertEquals(16, result);
    }
}