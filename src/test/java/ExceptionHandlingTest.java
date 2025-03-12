
import com.gevernova.ExceptionalHandling;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionHandlingTest {
    ExceptionalHandling exceptionalHandling=new ExceptionalHandling();
    @Test
    void testDivide(){
        ArithmeticException arithmeticException=assertThrows(ArithmeticException.class,()->{
            exceptionalHandling.divide(2,0);
        });
        assertEquals("Cannot Be Divided by zero",arithmeticException.getMessage());
    }
}
