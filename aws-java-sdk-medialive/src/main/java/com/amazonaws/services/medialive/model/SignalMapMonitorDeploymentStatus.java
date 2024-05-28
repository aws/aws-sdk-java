/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.medialive.model;

import javax.annotation.Generated;

/**
 * A signal map's monitor deployment status.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum SignalMapMonitorDeploymentStatus {

    NOT_DEPLOYED("NOT_DEPLOYED"),
    DRY_RUN_DEPLOYMENT_COMPLETE("DRY_RUN_DEPLOYMENT_COMPLETE"),
    DRY_RUN_DEPLOYMENT_FAILED("DRY_RUN_DEPLOYMENT_FAILED"),
    DRY_RUN_DEPLOYMENT_IN_PROGRESS("DRY_RUN_DEPLOYMENT_IN_PROGRESS"),
    DEPLOYMENT_COMPLETE("DEPLOYMENT_COMPLETE"),
    DEPLOYMENT_FAILED("DEPLOYMENT_FAILED"),
    DEPLOYMENT_IN_PROGRESS("DEPLOYMENT_IN_PROGRESS"),
    DELETE_COMPLETE("DELETE_COMPLETE"),
    DELETE_FAILED("DELETE_FAILED"),
    DELETE_IN_PROGRESS("DELETE_IN_PROGRESS");

    private String value;

    private SignalMapMonitorDeploymentStatus(String value) {
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
     * @return SignalMapMonitorDeploymentStatus corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static SignalMapMonitorDeploymentStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (SignalMapMonitorDeploymentStatus enumEntry : SignalMapMonitorDeploymentStatus.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
