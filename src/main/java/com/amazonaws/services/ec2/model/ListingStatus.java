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
package com.amazonaws.services.ec2.model;

/**
 * Listing Status
 */
public enum ListingStatus {
    
    Active("active"),
    Pending("pending"),
    Cancelled("cancelled"),
    Closed("closed");

    private String value;

    private ListingStatus(String value) {
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
     * @return ListingStatus corresponding to the value
     */
    public static ListingStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("active".equals(value)) {
            return ListingStatus.Active;
        } else if ("pending".equals(value)) {
            return ListingStatus.Pending;
        } else if ("cancelled".equals(value)) {
            return ListingStatus.Cancelled;
        } else if ("closed".equals(value)) {
            return ListingStatus.Closed;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    