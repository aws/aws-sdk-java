package com.amazonaws.codegen.model.service;

public enum AuthType {

    NONE("none");

    private final String value;

    AuthType(String value) {
        this.value = value;
    }

    public static AuthType fromValue(String value) {
        for (AuthType authType : AuthType.values()) {
            if (authType.value.equals(value)) {
                return authType;
            }
        }
        throw new IllegalArgumentException("Unsupported auth type " + value);
    }
}
