import com.gevernova.Calculate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculateTest {

    private Calculate calculate;  // make it a class field

    @BeforeEach
    void setUp() {
        calculate = new Calculate();  // initialize before each test
    }

    // Positive Test Cases

    @DisplayName("Test Addition of two positive numbers")
    @Test
    public void testAdd() {
        assertEquals(3, calculate.add(1, 2), "1 + 2 should be 3");
    }

    @Test
    public void testSub() {
        assertEquals(1, calculate.sub(4, 3), "4 - 3 should be 1");
    }

    @Test
    public void testMul() {
        assertEquals(2, calculate.multiply(1, 2), "1 * 2 should be 2");
    }

    @Test
    public void testDiv() {
        assertEquals(2, calculate.divide(4, 2), "4 / 2 should be 2");
    }

    // Negative Test Cases

    @Test
    public void testDivByZero() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            calculate.divide(5, 0);
        });
        assertEquals("Cannot Divided By zero", exception.getMessage());
    }

    // Additional Negative Test Examples

    @Test
    public void testAddWithNegativeNumbers() {
        assertEquals(-1, calculate.add(-3, 2), "-3 + 2 should be -1");
    }

    @Test
    public void testSubResultingNegative() {
        assertEquals(-5, calculate.sub(3, 8), "3 - 8 should be -5");
    }

    @Test
    public void testMultiplyByZero() {
        assertEquals(0, calculate.multiply(5, 0), "5 * 0 should be 0");
    }

    // Optional: test divide resulting in fraction (if your method returns int, expect truncated result)
    @Test
    public void testDivideWithNonIntegerResult() {
        assertEquals(2, calculate.divide(5, 2), "5 / 2 should be 2 (integer division)");
    }
}
