package org.example.calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertJHomework {

    @Test
    public void AddCalculatorTest() {
        float[] arrayTest = {1000, 4, 6, 12, 8};
        Calculator calculator = new Calculator();
        float result = calculator.addArray(arrayTest);

        Assertions.assertThat(result).isEqualTo(1030);

    }
    @Test
    public void DivideCalculatorTest() {
        float[] arrayTest = {1000, 4, 6, 12, 8};
        Calculator calculator = new Calculator();
        float result = calculator.divideArray(arrayTest);

        Assertions.assertThat(result).isEqualTo(0.4340278f);

    }
    @Test
    public void MultiplyCalculatorTest() {
        float[] arrayTest = {1000, 4, 6, 12, 8};
        Calculator calculator = new Calculator();
        float result = calculator.multiplyArray(arrayTest);

        Assertions.assertThat(result).isEqualTo(2304000);

}
    @Test
    public void SubtractCalculatorTest() {
        float[] arrayTest = {1000, 4, 6, 12, 8};
        Calculator calculator = new Calculator();
        float result = calculator.subtractArray(arrayTest);

        Assertions.assertThat(result).isEqualTo(970);


}
}