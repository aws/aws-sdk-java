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
package com.amazonaws.services.billingconductor.model;

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
    PRIMARY_NOT_ASSOCIATED("PRIMARY_NOT_ASSOCIATED"),
    PRIMARY_CANNOT_DISASSOCIATE("PRIMARY_CANNOT_DISASSOCIATE"),
    ACCOUNTS_NOT_ASSOCIATED("ACCOUNTS_NOT_ASSOCIATED"),
    ACCOUNTS_ALREADY_ASSOCIATED("ACCOUNTS_ALREADY_ASSOCIATED"),
    ILLEGAL_PRIMARY_ACCOUNT("ILLEGAL_PRIMARY_ACCOUNT"),
    ILLEGAL_ACCOUNTS("ILLEGAL_ACCOUNTS"),
    MISMATCHED_BILLINGGROUP_ARN("MISMATCHED_BILLINGGROUP_ARN"),
    MISSING_BILLINGGROUP("MISSING_BILLINGGROUP"),
    MISMATCHED_CUSTOMLINEITEM_ARN("MISMATCHED_CUSTOMLINEITEM_ARN"),
    ILLEGAL_BILLING_PERIOD("ILLEGAL_BILLING_PERIOD"),
    ILLEGAL_BILLING_PERIOD_RANGE("ILLEGAL_BILLING_PERIOD_RANGE"),
    TOO_MANY_ACCOUNTS_IN_REQUEST("TOO_MANY_ACCOUNTS_IN_REQUEST"),
    DUPLICATE_ACCOUNT("DUPLICATE_ACCOUNT"),
    INVALID_BILLING_GROUP_STATUS("INVALID_BILLING_GROUP_STATUS"),
    MISMATCHED_PRICINGPLAN_ARN("MISMATCHED_PRICINGPLAN_ARN"),
    MISSING_PRICINGPLAN("MISSING_PRICINGPLAN"),
    MISMATCHED_PRICINGRULE_ARN("MISMATCHED_PRICINGRULE_ARN"),
    DUPLICATE_PRICINGRULE_ARNS("DUPLICATE_PRICINGRULE_ARNS"),
    ILLEGAL_EXPRESSION("ILLEGAL_EXPRESSION"),
    ILLEGAL_SCOPE("ILLEGAL_SCOPE"),
    ILLEGAL_SERVICE("ILLEGAL_SERVICE"),
    PRICINGRULES_NOT_EXIST("PRICINGRULES_NOT_EXIST"),
    PRICINGRULES_ALREADY_ASSOCIATED("PRICINGRULES_ALREADY_ASSOCIATED"),
    PRICINGRULES_NOT_ASSOCIATED("PRICINGRULES_NOT_ASSOCIATED"),
    INVALID_TIME_RANGE("INVALID_TIME_RANGE"),
    INVALID_BILLINGVIEW_ARN("INVALID_BILLINGVIEW_ARN"),
    MISMATCHED_BILLINGVIEW_ARN("MISMATCHED_BILLINGVIEW_ARN"),
    ILLEGAL_CUSTOMLINEITEM("ILLEGAL_CUSTOMLINEITEM"),
    MISSING_CUSTOMLINEITEM("MISSING_CUSTOMLINEITEM"),
    ILLEGAL_CUSTOMLINEITEM_UPDATE("ILLEGAL_CUSTOMLINEITEM_UPDATE"),
    TOO_MANY_CUSTOMLINEITEMS_IN_REQUEST("TOO_MANY_CUSTOMLINEITEMS_IN_REQUEST"),
    ILLEGAL_CHARGE_DETAILS("ILLEGAL_CHARGE_DETAILS"),
    ILLEGAL_UPDATE_CHARGE_DETAILS("ILLEGAL_UPDATE_CHARGE_DETAILS"),
    INVALID_ARN("INVALID_ARN"),
    ILLEGAL_RESOURCE_ARNS("ILLEGAL_RESOURCE_ARNS"),
    ILLEGAL_CUSTOMLINEITEM_MODIFICATION("ILLEGAL_CUSTOMLINEITEM_MODIFICATION"),
    MISSING_LINKED_ACCOUNT_IDS("MISSING_LINKED_ACCOUNT_IDS"),
    MULTIPLE_LINKED_ACCOUNT_IDS("MULTIPLE_LINKED_ACCOUNT_IDS"),
    MISSING_PRICING_PLAN_ARN("MISSING_PRICING_PLAN_ARN"),
    MULTIPLE_PRICING_PLAN_ARN("MULTIPLE_PRICING_PLAN_ARN"),
    ILLEGAL_CHILD_ASSOCIATE_RESOURCE("ILLEGAL_CHILD_ASSOCIATE_RESOURCE"),
    CUSTOM_LINE_ITEM_ASSOCIATION_EXISTS("CUSTOM_LINE_ITEM_ASSOCIATION_EXISTS"),
    INVALID_BILLING_GROUP("INVALID_BILLING_GROUP"),
    INVALID_BILLING_PERIOD_FOR_OPERATION("INVALID_BILLING_PERIOD_FOR_OPERATION"),
    ILLEGAL_BILLING_ENTITY("ILLEGAL_BILLING_ENTITY"),
    ILLEGAL_MODIFIER_PERCENTAGE("ILLEGAL_MODIFIER_PERCENTAGE"),
    ILLEGAL_TYPE("ILLEGAL_TYPE"),
    ILLEGAL_ENDED_BILLINGGROUP("ILLEGAL_ENDED_BILLINGGROUP"),
    ILLEGAL_TIERING_INPUT("ILLEGAL_TIERING_INPUT");

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
