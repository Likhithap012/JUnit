import com.gevernova.TemperatureConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    TemperatureConverter converter = new TemperatureConverter();

    // Positive test cases
    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0));
        assertEquals(212.0, converter.celsiusToFahrenheit(100));
        assertEquals(98.6, converter.celsiusToFahrenheit(37));
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0, converter.fahrenheitToCelsius(32));
        assertEquals(100.0, converter.fahrenheitToCelsius(212));
        assertEquals(37.0, converter.fahrenheitToCelsius(98.6));
    }

    //  Negative test cases

    @Test
    void testCelsiusToFahrenheitBelowAbsoluteZero() {
        double result = converter.celsiusToFahrenheit(-300); // Below absolute zero
        assertTrue(result < -400); // Ensure it behaves consistently
    }

    @Test
    void testFahrenheitToCelsiusBelowAbsoluteZero() {
        double result = converter.fahrenheitToCelsius(-500); // Below absolute zero
        assertTrue(result < -270); // Just check it does not crash
    }

    @Test
    void testCelsiusToFahrenheitWithNaN() {
        double result = converter.celsiusToFahrenheit(Double.NaN);
        assertTrue(Double.isNaN(result));
    }

    @Test
    void testFahrenheitToCelsiusWithNaN() {
        double result = converter.fahrenheitToCelsius(Double.NaN);
        assertTrue(Double.isNaN(result));
    }

    @Test
    void testCelsiusToFahrenheitWithInfinity() {
        assertEquals(Double.POSITIVE_INFINITY, converter.celsiusToFahrenheit(Double.POSITIVE_INFINITY));
        assertEquals(Double.NEGATIVE_INFINITY, converter.celsiusToFahrenheit(Double.NEGATIVE_INFINITY));
    }

    @Test
    void testFahrenheitToCelsiusWithInfinity() {
        assertEquals(Double.POSITIVE_INFINITY, converter.fahrenheitToCelsius(Double.POSITIVE_INFINITY));
        assertEquals(Double.NEGATIVE_INFINITY, converter.fahrenheitToCelsius(Double.NEGATIVE_INFINITY));
    }
}
