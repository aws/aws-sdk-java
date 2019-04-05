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
package com.amazonaws.services.migrationhub.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ResourceAttributeType {

    IPV4_ADDRESS("IPV4_ADDRESS"),
    IPV6_ADDRESS("IPV6_ADDRESS"),
    MAC_ADDRESS("MAC_ADDRESS"),
    FQDN("FQDN"),
    VM_MANAGER_ID("VM_MANAGER_ID"),
    VM_MANAGED_OBJECT_REFERENCE("VM_MANAGED_OBJECT_REFERENCE"),
    VM_NAME("VM_NAME"),
    VM_PATH("VM_PATH"),
    BIOS_ID("BIOS_ID"),
    MOTHERBOARD_SERIAL_NUMBER("MOTHERBOARD_SERIAL_NUMBER");

    private String value;

    private ResourceAttributeType(String value) {
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
     * @return ResourceAttributeType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ResourceAttributeType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ResourceAttributeType enumEntry : ResourceAttributeType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
