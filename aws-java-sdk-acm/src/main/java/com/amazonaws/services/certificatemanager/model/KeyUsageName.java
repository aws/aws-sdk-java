/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.certificatemanager.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum KeyUsageName {

    DIGITAL_SIGNATURE("DIGITAL_SIGNATURE"),
    NON_REPUDIATION("NON_REPUDIATION"),
    KEY_ENCIPHERMENT("KEY_ENCIPHERMENT"),
    DATA_ENCIPHERMENT("DATA_ENCIPHERMENT"),
    KEY_AGREEMENT("KEY_AGREEMENT"),
    CERTIFICATE_SIGNING("CERTIFICATE_SIGNING"),
    CRL_SIGNING("CRL_SIGNING"),
    ENCIPHER_ONLY("ENCIPHER_ONLY"),
    DECIPHER_ONLY("DECIPHER_ONLY"),
    ANY("ANY"),
    CUSTOM("CUSTOM");

    private String value;

    private KeyUsageName(String value) {
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
     * @return KeyUsageName corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static KeyUsageName fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (KeyUsageName enumEntry : KeyUsageName.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
