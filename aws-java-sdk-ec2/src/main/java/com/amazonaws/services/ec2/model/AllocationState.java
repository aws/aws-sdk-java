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
package com.amazonaws.services.ec2.model;

/**
 * Allocation State
 */
public enum AllocationState {
    
    Available("available"),
    UnderAssessment("under-assessment"),
    PermanentFailure("permanent-failure"),
    Released("released"),
    ReleasedPermanentFailure("released-permanent-failure");

    private String value;

    private AllocationState(String value) {
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
     * @return AllocationState corresponding to the value
     */
    public static AllocationState fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("available".equals(value)) {
            return AllocationState.Available;
        } else if ("under-assessment".equals(value)) {
            return AllocationState.UnderAssessment;
        } else if ("permanent-failure".equals(value)) {
            return AllocationState.PermanentFailure;
        } else if ("released".equals(value)) {
            return AllocationState.Released;
        } else if ("released-permanent-failure".equals(value)) {
            return AllocationState.ReleasedPermanentFailure;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    