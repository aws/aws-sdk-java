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
 * State of the virtual interface.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Confirming</b>: The creation of the virtual interface is pending confirmation from the virtual interface owner. If
 * the owner of the virtual interface is different from the owner of the connection on which it is provisioned, then the
 * virtual interface will remain in this state until it is confirmed by the virtual interface owner.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Verifying</b>: This state only applies to public virtual interfaces. Each public virtual interface needs
 * validation before the virtual interface can be created.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Pending</b>: A virtual interface is in this state from the time that it is created until the virtual interface is
 * ready to forward traffic.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Available</b>: A virtual interface that is able to forward traffic.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Down</b>: A virtual interface that is BGP down.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Deleting</b>: A virtual interface is in this state immediately after calling <i>DeleteVirtualInterface</i> until
 * it can no longer forward traffic.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Deleted</b>: A virtual interface that cannot forward traffic.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Rejected</b>: The virtual interface owner has declined creation of the virtual interface. If a virtual interface
 * in the 'Confirming' state is deleted by the virtual interface owner, the virtual interface will enter the 'Rejected'
 * state.
 * </p>
 * </li>
 * </ul>
 */
public enum VirtualInterfaceState {

    Confirming("confirming"),
    Verifying("verifying"),
    Pending("pending"),
    Available("available"),
    Down("down"),
    Deleting("deleting"),
    Deleted("deleted"),
    Rejected("rejected");

    private String value;

    private VirtualInterfaceState(String value) {
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
     * @return VirtualInterfaceState corresponding to the value
     */
    public static VirtualInterfaceState fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (VirtualInterfaceState enumEntry : VirtualInterfaceState.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
