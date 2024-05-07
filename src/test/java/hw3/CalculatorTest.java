package hw3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void addTest(){
        //Given _ Arrange - Setup
        Calculator calculator = new Calculator();
        double expected = 10.0;
        //When - Act - Execute
        double actual = calculator.add(8.0, 2.0);
        //Then - Assert - Verify
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calculateAreaOfCircleTest() {
        Calculator calculator3 = new Calculator();
        double expected3 = 1256.64;
        double actual3 = calculator3.calculateAreaOfCircle(20.0);
        Assertions.assertEquals(expected3, actual3, .99);

    }
}