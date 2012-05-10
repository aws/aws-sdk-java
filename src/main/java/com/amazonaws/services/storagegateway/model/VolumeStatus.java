/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.storagegateway.model;

/**
 * Volume Status
 */
public enum VolumeStatus {
    
    CREATING("CREATING"),
    AVAILABLE("AVAILABLE"),
    RESTORING("RESTORING"),
    BOOTSTRAPPING("BOOTSTRAPPING"),
    IRRECOVERABLE("IRRECOVERABLE"),
    PASSTHROUGH("PASS THROUGH"),
    RESTOREANDPASSTHROUGH("RESTORE AND PASS THROUGH"),
    DELETED("DELETED"),
    WORKINGSTORAGENOTCONFIGURED("WORKING STORAGE NOT CONFIGURED");

    private String value;

    private VolumeStatus(String value) {
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
     * @return VolumeStatus corresponding to the value
     */
    public static VolumeStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("CREATING".equals(value)) {
            return VolumeStatus.CREATING;
        } else if ("AVAILABLE".equals(value)) {
            return VolumeStatus.AVAILABLE;
        } else if ("RESTORING".equals(value)) {
            return VolumeStatus.RESTORING;
        } else if ("BOOTSTRAPPING".equals(value)) {
            return VolumeStatus.BOOTSTRAPPING;
        } else if ("IRRECOVERABLE".equals(value)) {
            return VolumeStatus.IRRECOVERABLE;
        } else if ("PASS THROUGH".equals(value)) {
            return VolumeStatus.PASSTHROUGH;
        } else if ("RESTORE AND PASS THROUGH".equals(value)) {
            return VolumeStatus.RESTOREANDPASSTHROUGH;
        } else if ("DELETED".equals(value)) {
            return VolumeStatus.DELETED;
        } else if ("WORKING STORAGE NOT CONFIGURED".equals(value)) {
            return VolumeStatus.WORKINGSTORAGENOTCONFIGURED;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    