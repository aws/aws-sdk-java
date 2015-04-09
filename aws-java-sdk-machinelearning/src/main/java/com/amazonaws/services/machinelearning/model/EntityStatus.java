/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.machinelearning.model;

/**
 * Entity Status
 */
public enum EntityStatus {
    
    PENDING("PENDING"),
    INPROGRESS("INPROGRESS"),
    FAILED("FAILED"),
    COMPLETED("COMPLETED"),
    DELETED("DELETED");

    private String value;

    private EntityStatus(String value) {
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
     * @return EntityStatus corresponding to the value
     */
    public static EntityStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("PENDING".equals(value)) {
            return EntityStatus.PENDING;
        } else if ("INPROGRESS".equals(value)) {
            return EntityStatus.INPROGRESS;
        } else if ("FAILED".equals(value)) {
            return EntityStatus.FAILED;
        } else if ("COMPLETED".equals(value)) {
            return EntityStatus.COMPLETED;
        } else if ("DELETED".equals(value)) {
            return EntityStatus.DELETED;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    