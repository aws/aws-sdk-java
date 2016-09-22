/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directconnect.model;

/**
 * <p>
 * State of the interconnect.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Requested</b>: The initial state of an interconnect. The interconnect stays in the requested state until the
 * Letter of Authorization (LOA) is sent to the customer.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Pending</b>&gt;: The interconnect has been approved, and is being initialized.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Available</b>: The network link is up, and the interconnect is ready for use.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Down</b>: The network link is down.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Deleting</b>: The interconnect is in the process of being deleted.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Deleted</b>: The interconnect has been deleted.
 * </p>
 * </li>
 * </ul>
 */
public enum InterconnectState {

    Requested("requested"),
    Pending("pending"),
    Available("available"),
    Down("down"),
    Deleting("deleting"),
    Deleted("deleted");

    private String value;

    private InterconnectState(String value) {
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
     * @return InterconnectState corresponding to the value
     */
    public static InterconnectState fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (InterconnectState enumEntry : InterconnectState.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
