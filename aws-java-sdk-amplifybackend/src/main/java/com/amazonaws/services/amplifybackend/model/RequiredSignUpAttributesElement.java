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
package com.amazonaws.services.amplifybackend.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum RequiredSignUpAttributesElement {

    ADDRESS("ADDRESS"),
    BIRTHDATE("BIRTHDATE"),
    EMAIL("EMAIL"),
    FAMILY_NAME("FAMILY_NAME"),
    GENDER("GENDER"),
    GIVEN_NAME("GIVEN_NAME"),
    LOCALE("LOCALE"),
    MIDDLE_NAME("MIDDLE_NAME"),
    NAME("NAME"),
    NICKNAME("NICKNAME"),
    PHONE_NUMBER("PHONE_NUMBER"),
    PICTURE("PICTURE"),
    PREFERRED_USERNAME("PREFERRED_USERNAME"),
    PROFILE("PROFILE"),
    UPDATED_AT("UPDATED_AT"),
    WEBSITE("WEBSITE"),
    ZONE_INFO("ZONE_INFO");

    private String value;

    private RequiredSignUpAttributesElement(String value) {
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
     * @return RequiredSignUpAttributesElement corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static RequiredSignUpAttributesElement fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (RequiredSignUpAttributesElement enumEntry : RequiredSignUpAttributesElement.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
