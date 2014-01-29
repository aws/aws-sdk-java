/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodb.model;

/**
 * Table Status
 * @deprecated Use {@link com.amazonaws.services.dynamodbv2.model.TableStatus} instead.
 */
@Deprecated
public enum TableStatus {
    
    CREATING("CREATING"),
    UPDATING("UPDATING"),
    DELETING("DELETING"),
    ACTIVE("ACTIVE");

    private String value;

    private TableStatus(String value) {
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
     * @return TableStatus corresponding to the value
     */
    public static TableStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("CREATING".equals(value)) {
            return TableStatus.CREATING;
        } else if ("UPDATING".equals(value)) {
            return TableStatus.UPDATING;
        } else if ("DELETING".equals(value)) {
            return TableStatus.DELETING;
        } else if ("ACTIVE".equals(value)) {
            return TableStatus.ACTIVE;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    