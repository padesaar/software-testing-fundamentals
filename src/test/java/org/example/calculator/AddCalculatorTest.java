package org.example.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddCalculatorTest {

    @Test
    public void shouldReturnToSumAfterAddArrayIsCalled() {

        float[] array = {1000, 4, 6, 12, 8};

        Calculator calculator = new Calculator();
        float result = calculator.addArray(array);

        Assertions.assertEquals(1030, result);
    }
}