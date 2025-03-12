package com.gevernova;

public class DatabaseConnection {
    private boolean connected = false;

    // Simulate establishing a database connection
    public void connect() {
        connected = true;
        System.out.println("Connected to the database.");
    }

    // Simulate closing the database connection
    public void disconnect() {
        connected = false;
        System.out.println("Disconnected from the database.");
    }

    // Getter to check connection status
    public boolean isConnected() {
        return connected;
    }
}
