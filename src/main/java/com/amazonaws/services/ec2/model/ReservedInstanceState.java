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
 * Reserved Instance State
 */
public enum ReservedInstanceState {
    
    PaymentPending("payment-pending"),
    Active("active"),
    PaymentFailed("payment-failed"),
    Retired("retired");

    private String value;

    private ReservedInstanceState(String value) {
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
     * @return ReservedInstanceState corresponding to the value
     */
    public static ReservedInstanceState fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("payment-pending".equals(value)) {
            return ReservedInstanceState.PaymentPending;
        } else if ("active".equals(value)) {
            return ReservedInstanceState.Active;
        } else if ("payment-failed".equals(value)) {
            return ReservedInstanceState.PaymentFailed;
        } else if ("retired".equals(value)) {
            return ReservedInstanceState.Retired;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    