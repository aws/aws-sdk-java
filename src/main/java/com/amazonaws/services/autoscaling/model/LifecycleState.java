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
package com.amazonaws.services.autoscaling.model;

/**
 * Lifecycle State
 */
public enum LifecycleState {
    
    Pending("Pending"),
    PendingWait("Pending:Wait"),
    PendingProceed("Pending:Proceed"),
    Quarantined("Quarantined"),
    InService("InService"),
    Terminating("Terminating"),
    TerminatingWait("Terminating:Wait"),
    TerminatingProceed("Terminating:Proceed"),
    Terminated("Terminated"),
    Detaching("Detaching"),
    Detached("Detached"),
    EnteringStandby("EnteringStandby"),
    Standby("Standby");

    private String value;

    private LifecycleState(String value) {
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
     * @return LifecycleState corresponding to the value
     */
    public static LifecycleState fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("Pending".equals(value)) {
            return LifecycleState.Pending;
        } else if ("Pending:Wait".equals(value)) {
            return LifecycleState.PendingWait;
        } else if ("Pending:Proceed".equals(value)) {
            return LifecycleState.PendingProceed;
        } else if ("Quarantined".equals(value)) {
            return LifecycleState.Quarantined;
        } else if ("InService".equals(value)) {
            return LifecycleState.InService;
        } else if ("Terminating".equals(value)) {
            return LifecycleState.Terminating;
        } else if ("Terminating:Wait".equals(value)) {
            return LifecycleState.TerminatingWait;
        } else if ("Terminating:Proceed".equals(value)) {
            return LifecycleState.TerminatingProceed;
        } else if ("Terminated".equals(value)) {
            return LifecycleState.Terminated;
        } else if ("Detaching".equals(value)) {
            return LifecycleState.Detaching;
        } else if ("Detached".equals(value)) {
            return LifecycleState.Detached;
        } else if ("EnteringStandby".equals(value)) {
            return LifecycleState.EnteringStandby;
        } else if ("Standby".equals(value)) {
            return LifecycleState.Standby;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    