/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotthingsgraph.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum SystemInstanceDeploymentStatus {

    NOT_DEPLOYED("NOT_DEPLOYED"),
    BOOTSTRAP("BOOTSTRAP"),
    DEPLOY_IN_PROGRESS("DEPLOY_IN_PROGRESS"),
    DEPLOYED_IN_TARGET("DEPLOYED_IN_TARGET"),
    UNDEPLOY_IN_PROGRESS("UNDEPLOY_IN_PROGRESS"),
    FAILED("FAILED"),
    PENDING_DELETE("PENDING_DELETE"),
    DELETED_IN_TARGET("DELETED_IN_TARGET");

    private String value;

    private SystemInstanceDeploymentStatus(String value) {
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
     * @return SystemInstanceDeploymentStatus corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static SystemInstanceDeploymentStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (SystemInstanceDeploymentStatus enumEntry : SystemInstanceDeploymentStatus.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
