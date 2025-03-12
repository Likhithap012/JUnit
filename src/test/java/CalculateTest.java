

import com.gevernova.Calculate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculateTest {
    Calculate calculate=new Calculate();

    @DisplayName("LIKHITHA")
    @Test
    public void testAdd(){
        assertEquals(3,calculate.add(1,2));
    }

    @Test
    public void testSub(){
        assertEquals(1,calculate.sub(4,3));
    }

    @Test
    public void testMul(){
        assertEquals(2,calculate.multiply(1,2));
    }

    @Test
    public void testDiv(){
        assertEquals(2,calculate.divide(4,2));
    }
    @Test
    public void testDivByZero(){
        ArithmeticException arithmeticException=assertThrows(ArithmeticException.class,()->{
            calculate.divide(5,0);
        });
        assertEquals("Cannot Divided By zero",arithmeticException.getMessage());
    }


}
