/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.directconnect.model;

/**
 * Virtual Interface State
 */
public enum VirtualInterfaceState {
    
    Confirming("confirming"),
    Verifying("verifying"),
    Pending("pending"),
    Available("available"),
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
     *            real value
     * @return VirtualInterfaceState corresponding to the value
     */
    public static VirtualInterfaceState fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("confirming".equals(value)) {
            return VirtualInterfaceState.Confirming;
        } else if ("verifying".equals(value)) {
            return VirtualInterfaceState.Verifying;
        } else if ("pending".equals(value)) {
            return VirtualInterfaceState.Pending;
        } else if ("available".equals(value)) {
            return VirtualInterfaceState.Available;
        } else if ("deleting".equals(value)) {
            return VirtualInterfaceState.Deleting;
        } else if ("deleted".equals(value)) {
            return VirtualInterfaceState.Deleted;
        } else if ("rejected".equals(value)) {
            return VirtualInterfaceState.Rejected;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    