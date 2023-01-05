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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ValidationExceptionReason {

    UNKNOWN_OPERATION("UNKNOWN_OPERATION"),
    CANNOT_PARSE("CANNOT_PARSE"),
    FIELD_VALIDATION_FAILED("FIELD_VALIDATION_FAILED"),
    OTHER("OTHER"),
    INVALID_PARAMETER("INVALID_PARAMETER"),
    INVALID_ARN("INVALID_ARN"),
    INVALID_IDENTITY_FOR_DESTINATION_COUNTRY("INVALID_IDENTITY_FOR_DESTINATION_COUNTRY"),
    DESTINATION_COUNTRY_BLOCKED("DESTINATION_COUNTRY_BLOCKED"),
    CANNOT_ADD_OPTED_OUT_NUMBER("CANNOT_ADD_OPTED_OUT_NUMBER"),
    COUNTRY_CODE_MISMATCH("COUNTRY_CODE_MISMATCH"),
    INVALID_FILTER_VALUES("INVALID_FILTER_VALUES"),
    INVALID_NEXT_TOKEN("INVALID_NEXT_TOKEN"),
    MISSING_PARAMETER("MISSING_PARAMETER"),
    PARAMETERS_CANNOT_BE_USED_TOGETHER("PARAMETERS_CANNOT_BE_USED_TOGETHER"),
    PHONE_NUMBER_CANNOT_BE_OPTED_IN("PHONE_NUMBER_CANNOT_BE_OPTED_IN"),
    PHONE_NUMBER_CANNOT_BE_RELEASED("PHONE_NUMBER_CANNOT_BE_RELEASED"),
    PRICE_OVER_THRESHOLD("PRICE_OVER_THRESHOLD"),
    REQUESTED_SPEND_LIMIT_HIGHER_THAN_SERVICE_LIMIT("REQUESTED_SPEND_LIMIT_HIGHER_THAN_SERVICE_LIMIT"),
    SENDER_ID_NOT_REGISTERED("SENDER_ID_NOT_REGISTERED"),
    SENDER_ID_NOT_SUPPORTED("SENDER_ID_NOT_SUPPORTED"),
    TWO_WAY_NOT_ENABLED("TWO_WAY_NOT_ENABLED"),
    TWO_WAY_NOT_SUPPORTED_IN_COUNTRY("TWO_WAY_NOT_SUPPORTED_IN_COUNTRY"),
    TWO_WAY_NOT_SUPPORTED_IN_REGION("TWO_WAY_NOT_SUPPORTED_IN_REGION"),
    TWO_WAY_TOPIC_NOT_PRESENT("TWO_WAY_TOPIC_NOT_PRESENT");

    private String value;

    private ValidationExceptionReason(String value) {
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
     * @return ValidationExceptionReason corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ValidationExceptionReason fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ValidationExceptionReason enumEntry : ValidationExceptionReason.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
