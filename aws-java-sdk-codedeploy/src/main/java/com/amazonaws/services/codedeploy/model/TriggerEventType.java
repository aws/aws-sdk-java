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
public enum TriggerEventType {

    DeploymentStart("DeploymentStart"),
    DeploymentSuccess("DeploymentSuccess"),
    DeploymentFailure("DeploymentFailure"),
    DeploymentStop("DeploymentStop"),
    InstanceStart("InstanceStart"),
    InstanceSuccess("InstanceSuccess"),
    InstanceFailure("InstanceFailure");

    private String value;

    private TriggerEventType(String value) {
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
     * @return TriggerEventType corresponding to the value
     */
    public static TriggerEventType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("DeploymentStart".equals(value)) {
            return DeploymentStart;
        } else if ("DeploymentSuccess".equals(value)) {
            return DeploymentSuccess;
        } else if ("DeploymentFailure".equals(value)) {
            return DeploymentFailure;
        } else if ("DeploymentStop".equals(value)) {
            return DeploymentStop;
        } else if ("InstanceStart".equals(value)) {
            return InstanceStart;
        } else if ("InstanceSuccess".equals(value)) {
            return InstanceSuccess;
        } else if ("InstanceFailure".equals(value)) {
            return InstanceFailure;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}