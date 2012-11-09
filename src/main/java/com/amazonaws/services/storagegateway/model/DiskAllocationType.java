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
 * Disk Allocation Type
 */
public enum DiskAllocationType {
    
    AVAILABLE("AVAILABLE"),
    CACHESTORAGE("CACHE STORAGE"),
    STOREDISCSIVOLUME("STORED iSCSI VOLUME"),
    UPLOADBUFFER("UPLOAD BUFFER"),
    WORKINGSTORAGE("WORKING STORAGE");

    private String value;

    private DiskAllocationType(String value) {
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
     * @return DiskAllocationType corresponding to the value
     */
    public static DiskAllocationType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("AVAILABLE".equals(value)) {
            return DiskAllocationType.AVAILABLE;
        } else if ("CACHE STORAGE".equals(value)) {
            return DiskAllocationType.CACHESTORAGE;
        } else if ("STORED iSCSI VOLUME".equals(value)) {
            return DiskAllocationType.STOREDISCSIVOLUME;
        } else if ("UPLOAD BUFFER".equals(value)) {
            return DiskAllocationType.UPLOADBUFFER;
        } else if ("WORKING STORAGE".equals(value)) {
            return DiskAllocationType.WORKINGSTORAGE;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    