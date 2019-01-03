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
package com.amazonaws.services.comprehendmedical.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum EntitySubType {

    NAME("NAME"),
    DOSAGE("DOSAGE"),
    ROUTE_OR_MODE("ROUTE_OR_MODE"),
    FORM("FORM"),
    FREQUENCY("FREQUENCY"),
    DURATION("DURATION"),
    GENERIC_NAME("GENERIC_NAME"),
    BRAND_NAME("BRAND_NAME"),
    STRENGTH("STRENGTH"),
    RATE("RATE"),
    ACUITY("ACUITY"),
    TEST_NAME("TEST_NAME"),
    TEST_VALUE("TEST_VALUE"),
    TEST_UNITS("TEST_UNITS"),
    PROCEDURE_NAME("PROCEDURE_NAME"),
    TREATMENT_NAME("TREATMENT_NAME"),
    DATE("DATE"),
    AGE("AGE"),
    CONTACT_POINT("CONTACT_POINT"),
    EMAIL("EMAIL"),
    IDENTIFIER("IDENTIFIER"),
    URL("URL"),
    ADDRESS("ADDRESS"),
    PROFESSION("PROFESSION"),
    SYSTEM_ORGAN_SITE("SYSTEM_ORGAN_SITE"),
    DIRECTION("DIRECTION"),
    QUALITY("QUALITY"),
    QUANTITY("QUANTITY");

    private String value;

    private EntitySubType(String value) {
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
     * @return EntitySubType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static EntitySubType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (EntitySubType enumEntry : EntitySubType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
