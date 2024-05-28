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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ValidationExceptionReason {

    CANNOT_ADD_OPTED_OUT_NUMBER("CANNOT_ADD_OPTED_OUT_NUMBER"),
    CANNOT_PARSE("CANNOT_PARSE"),
    COUNTRY_CODE_MISMATCH("COUNTRY_CODE_MISMATCH"),
    DESTINATION_COUNTRY_BLOCKED("DESTINATION_COUNTRY_BLOCKED"),
    FIELD_VALIDATION_FAILED("FIELD_VALIDATION_FAILED"),
    ATTACHMENT_TYPE_NOT_SUPPORTED("ATTACHMENT_TYPE_NOT_SUPPORTED"),
    INVALID_ARN("INVALID_ARN"),
    INVALID_FILTER_VALUES("INVALID_FILTER_VALUES"),
    INVALID_IDENTITY_FOR_DESTINATION_COUNTRY("INVALID_IDENTITY_FOR_DESTINATION_COUNTRY"),
    INVALID_NEXT_TOKEN("INVALID_NEXT_TOKEN"),
    INVALID_PARAMETER("INVALID_PARAMETER"),
    INVALID_REQUEST("INVALID_REQUEST"),
    INVALID_REGISTRATION_ASSOCIATION("INVALID_REGISTRATION_ASSOCIATION"),
    MAXIMUM_SIZE_EXCEEDED("MAXIMUM_SIZE_EXCEEDED"),
    MEDIA_TYPE_NOT_SUPPORTED("MEDIA_TYPE_NOT_SUPPORTED"),
    MISSING_PARAMETER("MISSING_PARAMETER"),
    PARAMETERS_CANNOT_BE_USED_TOGETHER("PARAMETERS_CANNOT_BE_USED_TOGETHER"),
    PHONE_NUMBER_CANNOT_BE_OPTED_IN("PHONE_NUMBER_CANNOT_BE_OPTED_IN"),
    PHONE_NUMBER_CANNOT_BE_RELEASED("PHONE_NUMBER_CANNOT_BE_RELEASED"),
    PRICE_OVER_THRESHOLD("PRICE_OVER_THRESHOLD"),
    RESOURCE_NOT_ACCESSIBLE("RESOURCE_NOT_ACCESSIBLE"),
    REQUESTED_SPEND_LIMIT_HIGHER_THAN_SERVICE_LIMIT("REQUESTED_SPEND_LIMIT_HIGHER_THAN_SERVICE_LIMIT"),
    SENDER_ID_NOT_REGISTERED("SENDER_ID_NOT_REGISTERED"),
    SENDER_ID_NOT_SUPPORTED("SENDER_ID_NOT_SUPPORTED"),
    SENDER_ID_REQUIRES_REGISTRATION("SENDER_ID_REQUIRES_REGISTRATION"),
    TWO_WAY_TOPIC_NOT_PRESENT("TWO_WAY_TOPIC_NOT_PRESENT"),
    TWO_WAY_NOT_ENABLED("TWO_WAY_NOT_ENABLED"),
    TWO_WAY_NOT_SUPPORTED_IN_COUNTRY("TWO_WAY_NOT_SUPPORTED_IN_COUNTRY"),
    TWO_WAY_NOT_SUPPORTED_IN_REGION("TWO_WAY_NOT_SUPPORTED_IN_REGION"),
    TWO_WAY_CHANNEL_NOT_PRESENT("TWO_WAY_CHANNEL_NOT_PRESENT"),
    UNKNOWN_REGISTRATION_FIELD("UNKNOWN_REGISTRATION_FIELD"),
    UNKNOWN_REGISTRATION_SECTION("UNKNOWN_REGISTRATION_SECTION"),
    UNKNOWN_REGISTRATION_TYPE("UNKNOWN_REGISTRATION_TYPE"),
    UNKNOWN_REGISTRATION_VERSION("UNKNOWN_REGISTRATION_VERSION"),
    UNKNOWN_OPERATION("UNKNOWN_OPERATION"),
    REGISTRATION_FIELD_CANNOT_BE_DELETED("REGISTRATION_FIELD_CANNOT_BE_DELETED"),
    VERIFICATION_CODE_MISMATCH("VERIFICATION_CODE_MISMATCH"),
    VOICE_CAPABILITY_NOT_AVAILABLE("VOICE_CAPABILITY_NOT_AVAILABLE"),
    OTHER("OTHER");

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
