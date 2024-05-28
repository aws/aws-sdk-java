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
 * The metric to export, can be one of the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>SEND</code> - Emails sent eligible for tracking in the VDM dashboard. This excludes emails sent to the mailbox
 * simulator and emails addressed to more than one recipient.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>COMPLAINT</code> - Complaints received for your account. This excludes complaints from the mailbox simulator,
 * those originating from your account-level suppression list (if enabled), and those for emails addressed to more than
 * one recipient
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>PERMANENT_BOUNCE</code> - Permanent bounces - i.e., feedback received for emails sent to non-existent
 * mailboxes. Excludes bounces from the mailbox simulator, those originating from your account-level suppression list
 * (if enabled), and those for emails addressed to more than one recipient.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>TRANSIENT_BOUNCE</code> - Transient bounces - i.e., feedback received for delivery failures excluding issues
 * with non-existent mailboxes. Excludes bounces from the mailbox simulator, and those for emails addressed to more than
 * one recipient.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>OPEN</code> - Unique open events for emails including open trackers. Excludes opens for emails addressed to
 * more than one recipient.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CLICK</code> - Unique click events for emails including wrapped links. Excludes clicks for emails addressed to
 * more than one recipient.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DELIVERY</code> - Successful deliveries for email sending attempts. Excludes deliveries to the mailbox
 * simulator and for emails addressed to more than one recipient.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DELIVERY_OPEN</code> - Successful deliveries for email sending attempts. Excludes deliveries to the mailbox
 * simulator, for emails addressed to more than one recipient, and emails without open trackers.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DELIVERY_CLICK</code> - Successful deliveries for email sending attempts. Excludes deliveries to the mailbox
 * simulator, for emails addressed to more than one recipient, and emails without click trackers.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DELIVERY_COMPLAINT</code> - Successful deliveries for email sending attempts. Excludes deliveries to the
 * mailbox simulator, for emails addressed to more than one recipient, and emails addressed to recipients hosted by ISPs
 * with which Amazon SES does not have a feedback loop agreement.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum Metric {

    SEND("SEND"),
    COMPLAINT("COMPLAINT"),
    PERMANENT_BOUNCE("PERMANENT_BOUNCE"),
    TRANSIENT_BOUNCE("TRANSIENT_BOUNCE"),
    OPEN("OPEN"),
    CLICK("CLICK"),
    DELIVERY("DELIVERY"),
    DELIVERY_OPEN("DELIVERY_OPEN"),
    DELIVERY_CLICK("DELIVERY_CLICK"),
    DELIVERY_COMPLAINT("DELIVERY_COMPLAINT");

    private String value;

    private Metric(String value) {
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
     * @return Metric corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static Metric fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (Metric enumEntry : Metric.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
