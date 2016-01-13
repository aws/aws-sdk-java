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

package com.amazonaws.services.codedeploy.model;

/**
 * 
 */
public enum LifecycleEventStatus {

    Pending("Pending"),
    InProgress("InProgress"),
    Succeeded("Succeeded"),
    Failed("Failed"),
    Skipped("Skipped"),
    Unknown("Unknown");

    private String value;

    private LifecycleEventStatus(String value) {
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
     * @return LifecycleEventStatus corresponding to the value
     */
    public static LifecycleEventStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("Pending".equals(value)) {
            return Pending;
        } else if ("InProgress".equals(value)) {
            return InProgress;
        } else if ("Succeeded".equals(value)) {
            return Succeeded;
        } else if ("Failed".equals(value)) {
            return Failed;
        } else if ("Skipped".equals(value)) {
            return Skipped;
        } else if ("Unknown".equals(value)) {
            return Unknown;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}