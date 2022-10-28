package org.example.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestExample {
    @Test
    public void shouldReturnCorrectAddedNumbers() {
        //given part
        final int a = 8;
        final int b = 55;
        //when part
        final int addResult = a + b;

        //then part

       Assertions.assertEquals(63, addResult);

    }
}
