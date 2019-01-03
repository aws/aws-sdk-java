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
package com.amazonaws.services.pinpointemail.model;

import javax.annotation.Generated;

/**
 * <p>
 * The action that you want Amazon Pinpoint to take if it can't read the required MX record for a custom MAIL FROM
 * domain. When you set this value to <code>UseDefaultValue</code>, Amazon Pinpoint uses <i>amazonses.com</i> as the
 * MAIL FROM domain. When you set this value to <code>RejectMessage</code>, Amazon Pinpoint returns a
 * <code>MailFromDomainNotVerified</code> error, and doesn't attempt to deliver the email.
 * </p>
 * <p>
 * These behaviors are taken when the custom MAIL FROM domain configuration is in the <code>Pending</code>,
 * <code>Failed</code>, and <code>TemporaryFailure</code> states.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum BehaviorOnMxFailure {

    USE_DEFAULT_VALUE("USE_DEFAULT_VALUE"),
    REJECT_MESSAGE("REJECT_MESSAGE");

    private String value;

    private BehaviorOnMxFailure(String value) {
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
     * @return BehaviorOnMxFailure corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static BehaviorOnMxFailure fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (BehaviorOnMxFailure enumEntry : BehaviorOnMxFailure.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
