import com.gevernova.Parameterized;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class ParameterizedTests {
    Parameterized parameterized = new Parameterized();

    // Positive test cases
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8})
    void testIsEven(int number) {
        assertTrue(parameterized.isEven(number), number + " should be even");
    }

    // Test for odd numbers (expected to be false)
    @ParameterizedTest
    @ValueSource(ints = {7, 9})
    void testIsEvenWithOddNumbers(int number) {
        assertFalse(parameterized.isEven(number), number + " should be odd");
    }

    // Negative test case: negative even numbers
    @ParameterizedTest
    @ValueSource(ints = {-2, -4, -100})
    void testIsEvenWithNegativeEvenNumbers(int number) {
        assertTrue(parameterized.isEven(number), number + " should be even");
    }

    // Negative test case: negative odd numbers
    @ParameterizedTest
    @ValueSource(ints = {-1, -3, -99})
    void testIsEvenWithNegativeOddNumbers(int number) {
        assertFalse(parameterized.isEven(number), number + " should be odd");
    }

    // Edge case: Zero
    @Test
    void testIsEvenWithZero() {
        assertTrue(parameterized.isEven(0), "0 should be even");
    }

    //  Edge case: Integer.MIN_VALUE and MAX_VALUE
    @Test
    void testIsEvenWithExtremeValues() {
        assertTrue(parameterized.isEven(Integer.MIN_VALUE), "Integer.MIN_VALUE should be even");
        assertFalse(parameterized.isEven(Integer.MAX_VALUE), "Integer.MAX_VALUE should be odd");
    }
}
