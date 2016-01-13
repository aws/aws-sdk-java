/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
 * 
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
     *        real value
     * @return LifecycleState corresponding to the value
     */
    public static LifecycleState fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("Pending".equals(value)) {
            return Pending;
        } else if ("Pending:Wait".equals(value)) {
            return PendingWait;
        } else if ("Pending:Proceed".equals(value)) {
            return PendingProceed;
        } else if ("Quarantined".equals(value)) {
            return Quarantined;
        } else if ("InService".equals(value)) {
            return InService;
        } else if ("Terminating".equals(value)) {
            return Terminating;
        } else if ("Terminating:Wait".equals(value)) {
            return TerminatingWait;
        } else if ("Terminating:Proceed".equals(value)) {
            return TerminatingProceed;
        } else if ("Terminated".equals(value)) {
            return Terminated;
        } else if ("Detaching".equals(value)) {
            return Detaching;
        } else if ("Detached".equals(value)) {
            return Detached;
        } else if ("EnteringStandby".equals(value)) {
            return EnteringStandby;
        } else if ("Standby".equals(value)) {
            return Standby;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}