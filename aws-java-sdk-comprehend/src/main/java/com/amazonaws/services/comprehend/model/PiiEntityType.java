/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.comprehend.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum PiiEntityType {

    BANK_ACCOUNT_NUMBER("BANK_ACCOUNT_NUMBER"),
    BANK_ROUTING("BANK_ROUTING"),
    CREDIT_DEBIT_NUMBER("CREDIT_DEBIT_NUMBER"),
    CREDIT_DEBIT_CVV("CREDIT_DEBIT_CVV"),
    CREDIT_DEBIT_EXPIRY("CREDIT_DEBIT_EXPIRY"),
    PIN("PIN"),
    EMAIL("EMAIL"),
    ADDRESS("ADDRESS"),
    NAME("NAME"),
    PHONE("PHONE"),
    SSN("SSN"),
    DATE_TIME("DATE_TIME"),
    PASSPORT_NUMBER("PASSPORT_NUMBER"),
    DRIVER_ID("DRIVER_ID"),
    URL("URL"),
    AGE("AGE"),
    USERNAME("USERNAME"),
    PASSWORD("PASSWORD"),
    AWS_ACCESS_KEY("AWS_ACCESS_KEY"),
    AWS_SECRET_KEY("AWS_SECRET_KEY"),
    IP_ADDRESS("IP_ADDRESS"),
    MAC_ADDRESS("MAC_ADDRESS"),
    ALL("ALL"),
    LICENSE_PLATE("LICENSE_PLATE"),
    VEHICLE_IDENTIFICATION_NUMBER("VEHICLE_IDENTIFICATION_NUMBER"),
    UK_NATIONAL_INSURANCE_NUMBER("UK_NATIONAL_INSURANCE_NUMBER"),
    CA_SOCIAL_INSURANCE_NUMBER("CA_SOCIAL_INSURANCE_NUMBER"),
    US_INDIVIDUAL_TAX_IDENTIFICATION_NUMBER("US_INDIVIDUAL_TAX_IDENTIFICATION_NUMBER"),
    UK_UNIQUE_TAXPAYER_REFERENCE_NUMBER("UK_UNIQUE_TAXPAYER_REFERENCE_NUMBER"),
    IN_PERMANENT_ACCOUNT_NUMBER("IN_PERMANENT_ACCOUNT_NUMBER"),
    IN_NREGA("IN_NREGA"),
    INTERNATIONAL_BANK_ACCOUNT_NUMBER("INTERNATIONAL_BANK_ACCOUNT_NUMBER"),
    SWIFT_CODE("SWIFT_CODE"),
    UK_NATIONAL_HEALTH_SERVICE_NUMBER("UK_NATIONAL_HEALTH_SERVICE_NUMBER"),
    CA_HEALTH_NUMBER("CA_HEALTH_NUMBER"),
    IN_AADHAAR("IN_AADHAAR"),
    IN_VOTER_NUMBER("IN_VOTER_NUMBER");

    private String value;

    private PiiEntityType(String value) {
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
     * @return PiiEntityType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static PiiEntityType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (PiiEntityType enumEntry : PiiEntityType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
