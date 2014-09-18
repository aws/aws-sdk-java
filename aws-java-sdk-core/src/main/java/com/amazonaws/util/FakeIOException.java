package com.amazonaws.util;

import java.io.IOException;

/**
 * Used for simulating an IOException for test purposes.
 */
public class FakeIOException extends IOException {
    private static final long serialVersionUID = 1L;

    public FakeIOException(String message) {
        super(message);
    }
}