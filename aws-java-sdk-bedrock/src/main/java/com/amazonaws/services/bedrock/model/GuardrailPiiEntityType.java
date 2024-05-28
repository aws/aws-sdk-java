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
package com.amazonaws.services.bedrock.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum GuardrailPiiEntityType {

    ADDRESS("ADDRESS"),
    AGE("AGE"),
    AWS_ACCESS_KEY("AWS_ACCESS_KEY"),
    AWS_SECRET_KEY("AWS_SECRET_KEY"),
    CA_HEALTH_NUMBER("CA_HEALTH_NUMBER"),
    CA_SOCIAL_INSURANCE_NUMBER("CA_SOCIAL_INSURANCE_NUMBER"),
    CREDIT_DEBIT_CARD_CVV("CREDIT_DEBIT_CARD_CVV"),
    CREDIT_DEBIT_CARD_EXPIRY("CREDIT_DEBIT_CARD_EXPIRY"),
    CREDIT_DEBIT_CARD_NUMBER("CREDIT_DEBIT_CARD_NUMBER"),
    DRIVER_ID("DRIVER_ID"),
    EMAIL("EMAIL"),
    INTERNATIONAL_BANK_ACCOUNT_NUMBER("INTERNATIONAL_BANK_ACCOUNT_NUMBER"),
    IP_ADDRESS("IP_ADDRESS"),
    LICENSE_PLATE("LICENSE_PLATE"),
    MAC_ADDRESS("MAC_ADDRESS"),
    NAME("NAME"),
    PASSWORD("PASSWORD"),
    PHONE("PHONE"),
    PIN("PIN"),
    SWIFT_CODE("SWIFT_CODE"),
    UK_NATIONAL_HEALTH_SERVICE_NUMBER("UK_NATIONAL_HEALTH_SERVICE_NUMBER"),
    UK_NATIONAL_INSURANCE_NUMBER("UK_NATIONAL_INSURANCE_NUMBER"),
    UK_UNIQUE_TAXPAYER_REFERENCE_NUMBER("UK_UNIQUE_TAXPAYER_REFERENCE_NUMBER"),
    URL("URL"),
    USERNAME("USERNAME"),
    US_BANK_ACCOUNT_NUMBER("US_BANK_ACCOUNT_NUMBER"),
    US_BANK_ROUTING_NUMBER("US_BANK_ROUTING_NUMBER"),
    US_INDIVIDUAL_TAX_IDENTIFICATION_NUMBER("US_INDIVIDUAL_TAX_IDENTIFICATION_NUMBER"),
    US_PASSPORT_NUMBER("US_PASSPORT_NUMBER"),
    US_SOCIAL_SECURITY_NUMBER("US_SOCIAL_SECURITY_NUMBER"),
    VEHICLE_IDENTIFICATION_NUMBER("VEHICLE_IDENTIFICATION_NUMBER");

    private String value;

    private GuardrailPiiEntityType(String value) {
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
     * @return GuardrailPiiEntityType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static GuardrailPiiEntityType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (GuardrailPiiEntityType enumEntry : GuardrailPiiEntityType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
