/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import javax.annotation.Generated;

/**
 * <p>
 * State of the direct connect gateway.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Pending</b>: The initial state after calling <a>CreateDirectConnectGateway</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Available</b>: The direct connect gateway is ready for use.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Deleting</b>: The initial state after calling <a>DeleteDirectConnectGateway</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Deleted</b>: The direct connect gateway is deleted and cannot pass traffic.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DirectConnectGatewayState {

    Pending("pending"),
    Available("available"),
    Deleting("deleting"),
    Deleted("deleted");

    private String value;

    private DirectConnectGatewayState(String value) {
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
     * @return DirectConnectGatewayState corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DirectConnectGatewayState fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DirectConnectGatewayState enumEntry : DirectConnectGatewayState.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
