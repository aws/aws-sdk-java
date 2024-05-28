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
package com.amazonaws.services.simpleemailv2.model;

import javax.annotation.Generated;

/**
 * <p>
 * The type of delivery events:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>SEND</code> - The send request was successful and SES will attempt to deliver the message to the recipient’s
 * mail server. (If account-level or global suppression is being used, SES will still count it as a send, but delivery
 * is suppressed.)
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DELIVERY</code> - SES successfully delivered the email to the recipient's mail server. Excludes deliveries to
 * the mailbox simulator and emails addressed to more than one recipient.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>TRANSIENT_BOUNCE</code> - Feedback received for delivery failures excluding issues with non-existent mailboxes.
 * Excludes bounces from the mailbox simulator, and those from emails addressed to more than one recipient.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>PERMANENT_BOUNCE</code> - Feedback received for emails sent to non-existent mailboxes. Excludes bounces from
 * the mailbox simulator, those originating from your account-level suppression list (if enabled), and those from emails
 * addressed to more than one recipient.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UNDETERMINED_BOUNCE</code> - SES was unable to determine the bounce reason.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>COMPLAINT</code> - Complaint received for the email. This excludes complaints from the mailbox simulator, those
 * originating from your account-level suppression list (if enabled), and those from emails addressed to more than one
 * recipient.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DeliveryEventType {

    SEND("SEND"),
    DELIVERY("DELIVERY"),
    TRANSIENT_BOUNCE("TRANSIENT_BOUNCE"),
    PERMANENT_BOUNCE("PERMANENT_BOUNCE"),
    UNDETERMINED_BOUNCE("UNDETERMINED_BOUNCE"),
    COMPLAINT("COMPLAINT");

    private String value;

    private DeliveryEventType(String value) {
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
     * @return DeliveryEventType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DeliveryEventType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DeliveryEventType enumEntry : DeliveryEventType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
