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
 * State of the direct connect gateway attachment.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Attaching</b>: The initial state after a virtual interface is created using the direct connect gateway.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Attached</b>: The direct connect gateway and virtual interface are successfully attached and ready to pass
 * traffic.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Detaching</b>: The initial state after calling <a>DeleteVirtualInterface</a> on a virtual interface that is
 * attached to a direct connect gateway.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Detached</b>: The virtual interface is successfully detached from the direct connect gateway. Traffic flow between
 * the direct connect gateway and virtual interface stops.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DirectConnectGatewayAttachmentState {

    Attaching("attaching"),
    Attached("attached"),
    Detaching("detaching"),
    Detached("detached");

    private String value;

    private DirectConnectGatewayAttachmentState(String value) {
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
     * @return DirectConnectGatewayAttachmentState corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DirectConnectGatewayAttachmentState fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DirectConnectGatewayAttachmentState enumEntry : DirectConnectGatewayAttachmentState.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
