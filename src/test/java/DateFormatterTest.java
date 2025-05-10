import com.gevernova.DateFormatter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {

    DateFormatter formatter = new DateFormatter();

    // Positive Test Case
    @Test
    void testValidDateConversion() {
        assertEquals("25-12-2024", formatter.formatDate("2024-12-25"));
        assertEquals("01-01-2023", formatter.formatDate("2023-01-01"));
    }

    // Negative Test Case: Wrong date format (dd-MM-yyyy instead of yyyy-MM-dd)
    @Test
    void testInvalidDateFormat() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("25-12-2024");
        });
        assertEquals("Invalid date format. Expected yyyy-MM-dd", exception.getMessage());
    }

    // Negative Test Case: Empty string
    @Test
    void testEmptyDateString() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("");
        });
        assertEquals("Date string cannot be empty", exception.getMessage());
    }

    // Negative Test Case: Null input
    @Test
    void testNullDateString() {
        assertThrows(NullPointerException.class, () -> formatter.formatDate(null));
    }

    // Negative Test Case: Invalid month and day
    @Test
    void testInvalidDateValue() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("2024-13-40"); // 13th month, 40th day
        });
        assertEquals("Invalid date value", exception.getMessage());
    }

    // Negative Test Case: Non-date string input
    @Test
    void testNonDateString() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("abcd-ef-gh");
        });
        assertEquals("Invalid date format. Expected yyyy-MM-dd", exception.getMessage());
    }


}
