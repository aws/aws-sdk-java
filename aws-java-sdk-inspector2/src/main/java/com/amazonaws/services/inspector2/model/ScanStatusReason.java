/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.inspector2.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ScanStatusReason {

    PENDING_INITIAL_SCAN("PENDING_INITIAL_SCAN"),
    ACCESS_DENIED("ACCESS_DENIED"),
    INTERNAL_ERROR("INTERNAL_ERROR"),
    UNMANAGED_EC2_INSTANCE("UNMANAGED_EC2_INSTANCE"),
    UNSUPPORTED_OS("UNSUPPORTED_OS"),
    SCAN_ELIGIBILITY_EXPIRED("SCAN_ELIGIBILITY_EXPIRED"),
    RESOURCE_TERMINATED("RESOURCE_TERMINATED"),
    SUCCESSFUL("SUCCESSFUL"),
    NO_RESOURCES_FOUND("NO_RESOURCES_FOUND"),
    IMAGE_SIZE_EXCEEDED("IMAGE_SIZE_EXCEEDED"),
    SCAN_FREQUENCY_MANUAL("SCAN_FREQUENCY_MANUAL"),
    SCAN_FREQUENCY_SCAN_ON_PUSH("SCAN_FREQUENCY_SCAN_ON_PUSH"),
    EC2_INSTANCE_STOPPED("EC2_INSTANCE_STOPPED"),
    PENDING_DISABLE("PENDING_DISABLE"),
    NO_INVENTORY("NO_INVENTORY"),
    STALE_INVENTORY("STALE_INVENTORY"),
    EXCLUDED_BY_TAG("EXCLUDED_BY_TAG"),
    UNSUPPORTED_RUNTIME("UNSUPPORTED_RUNTIME");

    private String value;

    private ScanStatusReason(String value) {
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
     * @return ScanStatusReason corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ScanStatusReason fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ScanStatusReason enumEntry : ScanStatusReason.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
