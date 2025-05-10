import com.gevernova.ListManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListManagerTest {

    private ListManager listManager;
    private List<Integer> list;

    @BeforeEach
    void setUp() {
        listManager = new ListManager();
        list = new ArrayList<>();
    }

    // Positive Test Cases

    @Test
    void testAddElement() {
        listManager.addElement(list, 10);
        assertTrue(list.contains(10));
    }

    @Test
    void testRemoveElement() {
        list.add(20);
        listManager.removeElement(list, 20);
        assertFalse(list.contains(20));
    }

    @Test
    void testGetSize() {
        listManager.addElement(list, 1);
        listManager.addElement(list, 2);
        assertEquals(2, listManager.getSize(list));

        listManager.removeElement(list, 1);
        assertEquals(1, listManager.getSize(list));
    }

    @Test
    void testAddMultipleElements() {
        listManager.addElement(list, 5);
        listManager.addElement(list, 15);
        listManager.addElement(list, 25);
        assertEquals(3, listManager.getSize(list));
    }

    // Negative Test Cases

    @Test
    void testAddElementToNullList() {
        NullPointerException exception = assertThrows(NullPointerException.class, () -> {
            listManager.addElement(null, 10);
        });
        assertEquals("Cannot invoke \"java.util.List.add(Object)\" because \"list\" is null", exception.getMessage());
    }


    @Test
    void testGetSizeOfNullList() {
        NullPointerException exception = assertThrows(NullPointerException.class, () -> {
            listManager.getSize(null);
        });
        assertEquals("Cannot invoke \"java.util.List.size()\" because \"list\" is null", exception.getMessage());
    }
}
