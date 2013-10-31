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
package com.amazonaws.services.elasticmapreduce.model;

/**
 * Instance State
 */
public enum InstanceState {
    
    AWAITING_FULFILLMENT("AWAITING_FULFILLMENT"),
    PROVISIONING("PROVISIONING"),
    BOOTSTRAPPING("BOOTSTRAPPING"),
    RUNNING("RUNNING"),
    TERMINATED("TERMINATED");

    private String value;

    private InstanceState(String value) {
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
     * @return InstanceState corresponding to the value
     */
    public static InstanceState fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("AWAITING_FULFILLMENT".equals(value)) {
            return InstanceState.AWAITING_FULFILLMENT;
        } else if ("PROVISIONING".equals(value)) {
            return InstanceState.PROVISIONING;
        } else if ("BOOTSTRAPPING".equals(value)) {
            return InstanceState.BOOTSTRAPPING;
        } else if ("RUNNING".equals(value)) {
            return InstanceState.RUNNING;
        } else if ("TERMINATED".equals(value)) {
            return InstanceState.TERMINATED;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    