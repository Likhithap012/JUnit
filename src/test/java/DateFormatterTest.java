
import com.gevernova.DateFormatter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DateFormatterTest {

    DateFormatter formatter = new DateFormatter();

    @Test
    void testValidDateConversion() {
        assertEquals("25-12-2024", formatter.formatDate("2024-12-25"));
        assertEquals("01-01-2023", formatter.formatDate("2023-01-01"));
    }

    @Test
    void testInvalidDateFormat() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("25-12-2024"); // wrong format
        });
        assertEquals("Invalid date format. Expected yyyy-MM-dd", exception.getMessage());
    }

    @Test
    void testEmptyDateString() {
        assertThrows(IllegalArgumentException.class, () -> formatter.formatDate(""));
    }

    @Test
    void testInvalidDateValue() {
        assertThrows(IllegalArgumentException.class, () -> formatter.formatDate("2024-13-40")); // invalid month/day
    }
}

