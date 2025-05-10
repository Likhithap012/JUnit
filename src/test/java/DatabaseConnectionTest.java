import com.gevernova.DatabaseConnection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    // Positive Test Cases

    @Test
    public void testConnectionEstablished() {
        assertTrue(db.isConnected(), "Database should be connected before the test.");
    }

    @Test
    public void testConnectionActiveDuringTest() {
        assertTrue(db.isConnected(), "Database should remain connected during the test.");
    }

    // Note: This test assumes disconnect happens after this test finishes.
    @Test
    public void testDisconnectionAfterTest() {
        assertTrue(db.isConnected(), "Database should be connected during the test.");
        // We can't check disconnection directly here, but the teardown will handle it.
    }

    // Negative Test Cases

    @Test
    public void testDisconnectWorks() {
        db.disconnect();
        assertFalse(db.isConnected(), "Database should not be connected after disconnect.");
    }

    @Test
    public void testDoubleConnectDoesNotFail() {
        db.connect();
        assertTrue(db.isConnected(), "Database should remain connected after calling connect twice.");
    }

    @Test
    public void testDoubleDisconnectDoesNotFail() {
        db.disconnect();
        assertFalse(db.isConnected(), "Database should not be connected after first disconnect.");
        // Calling disconnect again should not throw or change state
        db.disconnect();
        assertFalse(db.isConnected(), "Database should remain disconnected after second disconnect.");
    }

    @Test
    public void testIsConnectedWithoutConnect() {
        DatabaseConnection newDb = new DatabaseConnection();
        assertFalse(newDb.isConnected(), "New DatabaseConnection should not be connected without connect() call.");
    }
}
