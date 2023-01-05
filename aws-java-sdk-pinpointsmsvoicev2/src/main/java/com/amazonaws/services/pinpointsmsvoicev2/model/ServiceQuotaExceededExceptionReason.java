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
public enum ServiceQuotaExceededExceptionReason {

    CONFIGURATION_SETS_PER_ACCOUNT("CONFIGURATION_SETS_PER_ACCOUNT"),
    DAILY_DESTINATION_CALL_LIMIT("DAILY_DESTINATION_CALL_LIMIT"),
    EVENT_DESTINATIONS_PER_CONFIGURATION_SET("EVENT_DESTINATIONS_PER_CONFIGURATION_SET"),
    KEYWORDS_PER_PHONE_NUMBER("KEYWORDS_PER_PHONE_NUMBER"),
    KEYWORDS_PER_POOL("KEYWORDS_PER_POOL"),
    MONTHLY_SPEND_LIMIT_REACHED_FOR_TEXT("MONTHLY_SPEND_LIMIT_REACHED_FOR_TEXT"),
    MONTHLY_SPEND_LIMIT_REACHED_FOR_VOICE("MONTHLY_SPEND_LIMIT_REACHED_FOR_VOICE"),
    OPT_OUT_LISTS_PER_ACCOUNT("OPT_OUT_LISTS_PER_ACCOUNT"),
    ORIGINATION_IDENTITIES_PER_POOL("ORIGINATION_IDENTITIES_PER_POOL"),
    PHONE_NUMBERS_PER_ACCOUNT("PHONE_NUMBERS_PER_ACCOUNT"),
    PHONE_NUMBERS_PER_REGISTRATION("PHONE_NUMBERS_PER_REGISTRATION"),
    POOLS_PER_ACCOUNT("POOLS_PER_ACCOUNT"),
    TAGS_PER_RESOURCE("TAGS_PER_RESOURCE");

    private String value;

    private ServiceQuotaExceededExceptionReason(String value) {
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
     * @return ServiceQuotaExceededExceptionReason corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ServiceQuotaExceededExceptionReason fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ServiceQuotaExceededExceptionReason enumEntry : ServiceQuotaExceededExceptionReason.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
