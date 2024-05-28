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
package com.amazonaws.services.appsync.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum SourceApiAssociationStatus {

    MERGE_SCHEDULED("MERGE_SCHEDULED"),
    MERGE_FAILED("MERGE_FAILED"),
    MERGE_SUCCESS("MERGE_SUCCESS"),
    MERGE_IN_PROGRESS("MERGE_IN_PROGRESS"),
    AUTO_MERGE_SCHEDULE_FAILED("AUTO_MERGE_SCHEDULE_FAILED"),
    DELETION_SCHEDULED("DELETION_SCHEDULED"),
    DELETION_IN_PROGRESS("DELETION_IN_PROGRESS"),
    DELETION_FAILED("DELETION_FAILED");

    private String value;

    private SourceApiAssociationStatus(String value) {
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
     * @return SourceApiAssociationStatus corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static SourceApiAssociationStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (SourceApiAssociationStatus enumEntry : SourceApiAssociationStatus.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
