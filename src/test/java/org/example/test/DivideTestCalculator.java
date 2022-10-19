package org.example.test;

import org.example.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DivideTestCalculator {

    @Test
    public void shouldReturnToResultAfterDivideArrayIsCalled() {


        float[] array = {1000, 4, 6, 12, 8};

        Calculator calculator = new Calculator();
        float result = calculator.divideArray(array);

        Assertions.assertEquals(0.4340278f, result);
    }
}