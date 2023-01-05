/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.migrationhuborchestrator.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum MigrationWorkflowStatusEnum {

    CREATING("CREATING"),
    NOT_STARTED("NOT_STARTED"),
    CREATION_FAILED("CREATION_FAILED"),
    STARTING("STARTING"),
    IN_PROGRESS("IN_PROGRESS"),
    WORKFLOW_FAILED("WORKFLOW_FAILED"),
    PAUSED("PAUSED"),
    PAUSING("PAUSING"),
    PAUSING_FAILED("PAUSING_FAILED"),
    USER_ATTENTION_REQUIRED("USER_ATTENTION_REQUIRED"),
    DELETING("DELETING"),
    DELETION_FAILED("DELETION_FAILED"),
    DELETED("DELETED"),
    COMPLETED("COMPLETED");

    private String value;

    private MigrationWorkflowStatusEnum(String value) {
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
     * @return MigrationWorkflowStatusEnum corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static MigrationWorkflowStatusEnum fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (MigrationWorkflowStatusEnum enumEntry : MigrationWorkflowStatusEnum.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
