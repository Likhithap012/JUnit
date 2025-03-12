
import com.gevernova.StringUtility;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilityTest {
    StringUtility stringUtility=new StringUtility();

    @Test
    void testReverse(){
        assertEquals("ahtihkil",stringUtility.reverse("likhitha"));
    }
    @Test
    void testPalindrome(){
        assertEquals(true,stringUtility.isPalindrome("mom"));
    }
    @Test
    void testUpperCase(){
        assertEquals("HI",stringUtility.upperCase("hi"));
    }
}
