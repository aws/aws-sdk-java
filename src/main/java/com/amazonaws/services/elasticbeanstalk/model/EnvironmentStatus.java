/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Environment Status
 */
public enum EnvironmentStatus {
    
    Launching("Launching"),
    Updating("Updating"),
    Ready("Ready"),
    Terminating("Terminating"),
    Terminated("Terminated");

    private String value;

    private EnvironmentStatus(String value) {
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
     * @return EnvironmentStatus corresponding to the value
     */
    public static EnvironmentStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("Launching".equals(value)) {
            return EnvironmentStatus.Launching;
        } else if ("Updating".equals(value)) {
            return EnvironmentStatus.Updating;
        } else if ("Ready".equals(value)) {
            return EnvironmentStatus.Ready;
        } else if ("Terminating".equals(value)) {
            return EnvironmentStatus.Terminating;
        } else if ("Terminated".equals(value)) {
            return EnvironmentStatus.Terminated;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    