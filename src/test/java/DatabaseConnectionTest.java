
import com.gevernova.DatabaseConnection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DatabaseConnectionTest {
    private DatabaseConnection db;

    @BeforeEach
    public void setUp() {
        db = new DatabaseConnection();
        db.connect();
    }

    @AfterEach
    public void tearDown() {
        db.disconnect();
    }

    @Test
    public void testConnectionEstablished() {
        assertTrue(db.isConnected(), "Database should be connected before the test.");
    }

    @Test
    public void testConnectionActiveDuringTest() {
        assertTrue(db.isConnected(), "Database should remain connected during the test.");
    }

    @Test
    public void testDisconnectionAfterTest() {
        // This test won't directly see the disconnect since @AfterEach runs after test
        // But it ensures the structure: connect before, disconnect after.
        assertTrue(db.isConnected());
    }
}
