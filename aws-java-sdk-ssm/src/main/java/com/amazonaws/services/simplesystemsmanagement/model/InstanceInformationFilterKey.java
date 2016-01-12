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

package com.amazonaws.services.simplesystemsmanagement.model;

/**
 * 
 */
public enum InstanceInformationFilterKey {

    InstanceIds("InstanceIds"),
    AgentVersion("AgentVersion"),
    PingStatus("PingStatus"),
    PlatformTypes("PlatformTypes");

    private String value;

    private InstanceInformationFilterKey(String value) {
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
     * @return InstanceInformationFilterKey corresponding to the value
     */
    public static InstanceInformationFilterKey fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("InstanceIds".equals(value)) {
            return InstanceIds;
        } else if ("AgentVersion".equals(value)) {
            return AgentVersion;
        } else if ("PingStatus".equals(value)) {
            return PingStatus;
        } else if ("PlatformTypes".equals(value)) {
            return PlatformTypes;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}