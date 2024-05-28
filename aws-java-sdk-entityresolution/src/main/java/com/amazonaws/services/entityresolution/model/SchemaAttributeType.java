/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.entityresolution.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum SchemaAttributeType {

    NAME("NAME"),
    NAME_FIRST("NAME_FIRST"),
    NAME_MIDDLE("NAME_MIDDLE"),
    NAME_LAST("NAME_LAST"),
    ADDRESS("ADDRESS"),
    ADDRESS_STREET1("ADDRESS_STREET1"),
    ADDRESS_STREET2("ADDRESS_STREET2"),
    ADDRESS_STREET3("ADDRESS_STREET3"),
    ADDRESS_CITY("ADDRESS_CITY"),
    ADDRESS_STATE("ADDRESS_STATE"),
    ADDRESS_COUNTRY("ADDRESS_COUNTRY"),
    ADDRESS_POSTALCODE("ADDRESS_POSTALCODE"),
    PHONE("PHONE"),
    PHONE_NUMBER("PHONE_NUMBER"),
    PHONE_COUNTRYCODE("PHONE_COUNTRYCODE"),
    EMAIL_ADDRESS("EMAIL_ADDRESS"),
    UNIQUE_ID("UNIQUE_ID"),
    DATE("DATE"),
    STRING("STRING"),
    PROVIDER_ID("PROVIDER_ID");

    private String value;

    private SchemaAttributeType(String value) {
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
     * @return SchemaAttributeType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static SchemaAttributeType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (SchemaAttributeType enumEntry : SchemaAttributeType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
