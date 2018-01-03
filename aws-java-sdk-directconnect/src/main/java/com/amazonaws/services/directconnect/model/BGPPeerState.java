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
 * The state of the BGP peer.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Verifying</b>: The BGP peering addresses or ASN require validation before the BGP peer can be created. This state
 * only applies to BGP peers on a public virtual interface.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Pending</b>: The BGP peer has been created, and is in this state until it is ready to be established.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Available</b>: The BGP peer can be established.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Deleting</b>: The BGP peer is in the process of being deleted.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Deleted</b>: The BGP peer has been deleted and cannot be established.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum BGPPeerState {

    Verifying("verifying"),
    Pending("pending"),
    Available("available"),
    Deleting("deleting"),
    Deleted("deleted");

    private String value;

    private BGPPeerState(String value) {
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
     * @return BGPPeerState corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static BGPPeerState fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (BGPPeerState enumEntry : BGPPeerState.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
