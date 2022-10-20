package org.example.test;

import org.example.calculator.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator;

    private static float[] testArray;

    //this method is called before all the tests
    @BeforeAll
    public static void setupGlobal() {
        System.out.println("Starting calculator tests");
        testArray = new float[] {3, 45, 6.7f, 12, 4.2f, 8.9f};
    }

    //this method is called before start run of each test
    @BeforeEach
    public void setupEach() {
        calculator = new Calculator(); //kuna siin olemas siis testis ei pea eraldi tooma seda välja

    }

    //this method is called after run of each test
    //you can also put here any operation (for,while etc)
    @AfterEach
    public void finalSetupEach(){
        System.out.println("This test is finished running");

    }
    //this method is called after all the tests are finished
    @AfterAll
    public static void finalSetupGlobal() {
        System.out.println("Calculator tests are finished successfully");
    }
    @Test
    @Disabled //mean this test will not be running at all
    public void shouldReturnToResultWhenMultiplyArrayIsCalled() {

        float result = calculator.multiplyArray(testArray);

        Assertions.assertEquals(405722.47f, result);


    }
    @Test

    public void shouldReturnToMultipliedAfterMultiplyArrayIsCalled(){

        float result = calculator.multiplyArray(testArray);

        Assertions.assertAll(() -> Assertions.assertTrue(result > 0),
        () -> Assertions.assertEquals(405722.47f, result));
    }

}