
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
}
