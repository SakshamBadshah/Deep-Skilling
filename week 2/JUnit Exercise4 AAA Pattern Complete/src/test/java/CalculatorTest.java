import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup method executed");
    }

    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown method executed");
    }

    @Test
    public void testAddition() {
        // Arrange
        int num1 = 10;
        int num2 = 5;
        int expectedResult = 15;

        // Act
        int actualResult = calculator.add(num1, num2);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSubtraction() {
        // Arrange
        int num1 = 10;
        int num2 = 5;
        int expectedResult = 5;

        // Act
        int actualResult = calculator.subtract(num1, num2);

        // Assert
        assertEquals(expectedResult, actualResult);
    }
}