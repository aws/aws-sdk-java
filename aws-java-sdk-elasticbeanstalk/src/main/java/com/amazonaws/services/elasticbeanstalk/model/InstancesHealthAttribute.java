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

package com.amazonaws.services.elasticbeanstalk.model;

/**
 * 
 */
public enum InstancesHealthAttribute {

    HealthStatus("HealthStatus"),
    Color("Color"),
    Causes("Causes"),
    ApplicationMetrics("ApplicationMetrics"),
    RefreshedAt("RefreshedAt"),
    LaunchedAt("LaunchedAt"),
    System("System"),
    All("All");

    private String value;

    private InstancesHealthAttribute(String value) {
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
     * @return InstancesHealthAttribute corresponding to the value
     */
    public static InstancesHealthAttribute fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("HealthStatus".equals(value)) {
            return HealthStatus;
        } else if ("Color".equals(value)) {
            return Color;
        } else if ("Causes".equals(value)) {
            return Causes;
        } else if ("ApplicationMetrics".equals(value)) {
            return ApplicationMetrics;
        } else if ("RefreshedAt".equals(value)) {
            return RefreshedAt;
        } else if ("LaunchedAt".equals(value)) {
            return LaunchedAt;
        } else if ("System".equals(value)) {
            return System;
        } else if ("All".equals(value)) {
            return All;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}