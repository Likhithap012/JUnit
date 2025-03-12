
import com.gevernova.Parameterized;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParameterizedTests {
    Parameterized parameterized=new Parameterized();
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6,8})
    void testIsEven(int number){
        assertTrue(parameterized.isEven(number), number + " should be even");
    }

    @ParameterizedTest
    @ValueSource(ints = {7, 9})
    void testIsEvenWithOddNumbers(int number) {
        assertFalse(parameterized.isEven(number), number + " should be odd");
    }


}
