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
public enum ConflictExceptionReason {

    CREATE_REGISTRATION_VERSION_NOT_ALLOWED("CREATE_REGISTRATION_VERSION_NOT_ALLOWED"),
    DELETION_PROTECTION_ENABLED("DELETION_PROTECTION_ENABLED"),
    DESTINATION_PHONE_NUMBER_NOT_VERIFIED("DESTINATION_PHONE_NUMBER_NOT_VERIFIED"),
    DESTINATION_PHONE_NUMBER_OPTED_OUT("DESTINATION_PHONE_NUMBER_OPTED_OUT"),
    DISASSOCIATE_REGISTRATION_NOT_ALLOWED("DISASSOCIATE_REGISTRATION_NOT_ALLOWED"),
    DISCARD_REGISTRATION_VERSION_NOT_ALLOWED("DISCARD_REGISTRATION_VERSION_NOT_ALLOWED"),
    EDIT_REGISTRATION_FIELD_VALUES_NOT_ALLOWED("EDIT_REGISTRATION_FIELD_VALUES_NOT_ALLOWED"),
    EVENT_DESTINATION_MISMATCH("EVENT_DESTINATION_MISMATCH"),
    KEYWORD_MISMATCH("KEYWORD_MISMATCH"),
    LAST_PHONE_NUMBER("LAST_PHONE_NUMBER"),
    NUMBER_CAPABILITIES_MISMATCH("NUMBER_CAPABILITIES_MISMATCH"),
    MESSAGE_TYPE_MISMATCH("MESSAGE_TYPE_MISMATCH"),
    NO_ORIGINATION_IDENTITIES_FOUND("NO_ORIGINATION_IDENTITIES_FOUND"),
    OPT_OUT_LIST_MISMATCH("OPT_OUT_LIST_MISMATCH"),
    PHONE_NUMBER_ASSOCIATED_TO_POOL("PHONE_NUMBER_ASSOCIATED_TO_POOL"),
    PHONE_NUMBER_ASSOCIATED_TO_REGISTRATION("PHONE_NUMBER_ASSOCIATED_TO_REGISTRATION"),
    PHONE_NUMBER_NOT_ASSOCIATED_TO_POOL("PHONE_NUMBER_NOT_ASSOCIATED_TO_POOL"),
    PHONE_NUMBER_NOT_IN_REGISTRATION_REGION("PHONE_NUMBER_NOT_IN_REGISTRATION_REGION"),
    REGISTRATION_ALREADY_SUBMITTED("REGISTRATION_ALREADY_SUBMITTED"),
    REGISTRATION_NOT_COMPLETE("REGISTRATION_NOT_COMPLETE"),
    SENDER_ID_ASSOCIATED_TO_POOL("SENDER_ID_ASSOCIATED_TO_POOL"),
    RESOURCE_ALREADY_EXISTS("RESOURCE_ALREADY_EXISTS"),
    RESOURCE_DELETION_NOT_ALLOWED("RESOURCE_DELETION_NOT_ALLOWED"),
    RESOURCE_MODIFICATION_NOT_ALLOWED("RESOURCE_MODIFICATION_NOT_ALLOWED"),
    RESOURCE_NOT_ACTIVE("RESOURCE_NOT_ACTIVE"),
    RESOURCE_NOT_EMPTY("RESOURCE_NOT_EMPTY"),
    SELF_MANAGED_OPT_OUTS_MISMATCH("SELF_MANAGED_OPT_OUTS_MISMATCH"),
    SUBMIT_REGISTRATION_VERSION_NOT_ALLOWED("SUBMIT_REGISTRATION_VERSION_NOT_ALLOWED"),
    TWO_WAY_CONFIG_MISMATCH("TWO_WAY_CONFIG_MISMATCH"),
    VERIFICATION_CODE_EXPIRED("VERIFICATION_CODE_EXPIRED"),
    VERIFICATION_ALREADY_COMPLETE("VERIFICATION_ALREADY_COMPLETE"),
    PROTECT_CONFIGURATION_IS_ACCOUNT_DEFAULT("PROTECT_CONFIGURATION_IS_ACCOUNT_DEFAULT"),
    PROTECT_CONFIGURATION_ASSOCIATED_WITH_CONFIGURATION_SET("PROTECT_CONFIGURATION_ASSOCIATED_WITH_CONFIGURATION_SET"),
    PROTECT_CONFIGURATION_NOT_ASSOCIATED_WITH_CONFIGURATION_SET("PROTECT_CONFIGURATION_NOT_ASSOCIATED_WITH_CONFIGURATION_SET"),
    DESTINATION_COUNTRY_BLOCKED_BY_PROTECT_CONFIGURATION("DESTINATION_COUNTRY_BLOCKED_BY_PROTECT_CONFIGURATION");

    private String value;

    private ConflictExceptionReason(String value) {
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
     * @return ConflictExceptionReason corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ConflictExceptionReason fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ConflictExceptionReason enumEntry : ConflictExceptionReason.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
