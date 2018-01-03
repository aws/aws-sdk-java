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
 * State of the direct connect gateway association.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Associating</b>: The initial state after calling <a>CreateDirectConnectGatewayAssociation</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Associated</b>: The direct connect gateway and virtual private gateway are successfully associated and ready to
 * pass traffic.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Disassociating</b>: The initial state after calling <a>DeleteDirectConnectGatewayAssociation</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Disassociated</b>: The virtual private gateway is successfully disassociated from the direct connect gateway.
 * Traffic flow between the direct connect gateway and virtual private gateway stops.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DirectConnectGatewayAssociationState {

    Associating("associating"),
    Associated("associated"),
    Disassociating("disassociating"),
    Disassociated("disassociated");

    private String value;

    private DirectConnectGatewayAssociationState(String value) {
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
     * @return DirectConnectGatewayAssociationState corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DirectConnectGatewayAssociationState fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DirectConnectGatewayAssociationState enumEntry : DirectConnectGatewayAssociationState.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
