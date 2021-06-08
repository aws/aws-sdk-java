/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.glue.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ConnectionPropertyKey {

    HOST("HOST"),
    PORT("PORT"),
    USERNAME("USERNAME"),
    PASSWORD("PASSWORD"),
    ENCRYPTED_PASSWORD("ENCRYPTED_PASSWORD"),
    JDBC_DRIVER_JAR_URI("JDBC_DRIVER_JAR_URI"),
    JDBC_DRIVER_CLASS_NAME("JDBC_DRIVER_CLASS_NAME"),
    JDBC_ENGINE("JDBC_ENGINE"),
    JDBC_ENGINE_VERSION("JDBC_ENGINE_VERSION"),
    CONFIG_FILES("CONFIG_FILES"),
    INSTANCE_ID("INSTANCE_ID"),
    JDBC_CONNECTION_URL("JDBC_CONNECTION_URL"),
    JDBC_ENFORCE_SSL("JDBC_ENFORCE_SSL"),
    CUSTOM_JDBC_CERT("CUSTOM_JDBC_CERT"),
    SKIP_CUSTOM_JDBC_CERT_VALIDATION("SKIP_CUSTOM_JDBC_CERT_VALIDATION"),
    CUSTOM_JDBC_CERT_STRING("CUSTOM_JDBC_CERT_STRING"),
    CONNECTION_URL("CONNECTION_URL"),
    KAFKA_BOOTSTRAP_SERVERS("KAFKA_BOOTSTRAP_SERVERS"),
    KAFKA_SSL_ENABLED("KAFKA_SSL_ENABLED"),
    KAFKA_CUSTOM_CERT("KAFKA_CUSTOM_CERT"),
    KAFKA_SKIP_CUSTOM_CERT_VALIDATION("KAFKA_SKIP_CUSTOM_CERT_VALIDATION"),
    KAFKA_CLIENT_KEYSTORE("KAFKA_CLIENT_KEYSTORE"),
    KAFKA_CLIENT_KEYSTORE_PASSWORD("KAFKA_CLIENT_KEYSTORE_PASSWORD"),
    KAFKA_CLIENT_KEY_PASSWORD("KAFKA_CLIENT_KEY_PASSWORD"),
    ENCRYPTED_KAFKA_CLIENT_KEYSTORE_PASSWORD("ENCRYPTED_KAFKA_CLIENT_KEYSTORE_PASSWORD"),
    ENCRYPTED_KAFKA_CLIENT_KEY_PASSWORD("ENCRYPTED_KAFKA_CLIENT_KEY_PASSWORD"),
    SECRET_ID("SECRET_ID"),
    CONNECTOR_URL("CONNECTOR_URL"),
    CONNECTOR_TYPE("CONNECTOR_TYPE"),
    CONNECTOR_CLASS_NAME("CONNECTOR_CLASS_NAME");

    private String value;

    private ConnectionPropertyKey(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return ConnectionPropertyKey corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ConnectionPropertyKey fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ConnectionPropertyKey enumEntry : ConnectionPropertyKey.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
