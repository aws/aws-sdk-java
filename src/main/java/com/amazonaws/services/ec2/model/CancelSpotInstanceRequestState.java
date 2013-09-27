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
 * Cancel Spot Instance Request State
 */
public enum CancelSpotInstanceRequestState {
    
    Active("active"),
    Open("open"),
    Closed("closed"),
    Cancelled("cancelled"),
    Completed("completed");

    private String value;

    private CancelSpotInstanceRequestState(String value) {
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
     * @return CancelSpotInstanceRequestState corresponding to the value
     */
    public static CancelSpotInstanceRequestState fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("active".equals(value)) {
            return CancelSpotInstanceRequestState.Active;
        } else if ("open".equals(value)) {
            return CancelSpotInstanceRequestState.Open;
        } else if ("closed".equals(value)) {
            return CancelSpotInstanceRequestState.Closed;
        } else if ("cancelled".equals(value)) {
            return CancelSpotInstanceRequestState.Cancelled;
        } else if ("completed".equals(value)) {
            return CancelSpotInstanceRequestState.Completed;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    