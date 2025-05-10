package com.gevernova;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatter {

    public String formatDate(String input) {
        if (input == null) {
            throw new NullPointerException("Date string cannot be null");
        }

        if (input.trim().isEmpty()) {
            throw new IllegalArgumentException("Date string cannot be empty");
        }

        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {
            LocalDate date = LocalDate.parse(input, inputFormatter);
            return date.format(outputFormatter);
        } catch (DateTimeParseException e) {
            if (!input.matches("\\d{4}-\\d{2}-\\d{2}")) {
                throw new IllegalArgumentException("Invalid date format. Expected yyyy-MM-dd");
            } else {
                throw new IllegalArgumentException("Invalid date value");
            }
        }
    }
}

