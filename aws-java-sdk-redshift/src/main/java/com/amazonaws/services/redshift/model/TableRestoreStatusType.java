/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model;

/**
 * Table Restore Status Type
 */
public enum TableRestoreStatusType {
    
    PENDING("PENDING"),
    IN_PROGRESS("IN_PROGRESS"),
    SUCCEEDED("SUCCEEDED"),
    FAILED("FAILED"),
    CANCELED("CANCELED");

    private String value;

    private TableRestoreStatusType(String value) {
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
     * @return TableRestoreStatusType corresponding to the value
     */
    public static TableRestoreStatusType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("PENDING".equals(value)) {
            return TableRestoreStatusType.PENDING;
        } else if ("IN_PROGRESS".equals(value)) {
            return TableRestoreStatusType.IN_PROGRESS;
        } else if ("SUCCEEDED".equals(value)) {
            return TableRestoreStatusType.SUCCEEDED;
        } else if ("FAILED".equals(value)) {
            return TableRestoreStatusType.FAILED;
        } else if ("CANCELED".equals(value)) {
            return TableRestoreStatusType.CANCELED;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    