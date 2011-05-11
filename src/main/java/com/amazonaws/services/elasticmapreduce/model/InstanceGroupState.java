/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Instance Group State
 */
public enum InstanceGroupState {
    
    PROVISIONING("PROVISIONING"),
    STARTING("STARTING"),
    BOOTSTRAPPING("BOOTSTRAPPING"),
    RUNNING("RUNNING"),
    RESIZING("RESIZING"),
    ARRESTED("ARRESTED"),
    SHUTTING_DOWN("SHUTTING_DOWN"),
    TERMINATED("TERMINATED"),
    FAILED("FAILED"),
    ENDED("ENDED");

    private String value;

    private InstanceGroupState(String value) {
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
     * @return InstanceGroupState corresponding to the value
     */
    public static InstanceGroupState fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("PROVISIONING".equals(value)) {
            return InstanceGroupState.PROVISIONING;
        } else if ("STARTING".equals(value)) {
            return InstanceGroupState.STARTING;
        } else if ("BOOTSTRAPPING".equals(value)) {
            return InstanceGroupState.BOOTSTRAPPING;
        } else if ("RUNNING".equals(value)) {
            return InstanceGroupState.RUNNING;
        } else if ("RESIZING".equals(value)) {
            return InstanceGroupState.RESIZING;
        } else if ("ARRESTED".equals(value)) {
            return InstanceGroupState.ARRESTED;
        } else if ("SHUTTING_DOWN".equals(value)) {
            return InstanceGroupState.SHUTTING_DOWN;
        } else if ("TERMINATED".equals(value)) {
            return InstanceGroupState.TERMINATED;
        } else if ("FAILED".equals(value)) {
            return InstanceGroupState.FAILED;
        } else if ("ENDED".equals(value)) {
            return InstanceGroupState.ENDED;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    