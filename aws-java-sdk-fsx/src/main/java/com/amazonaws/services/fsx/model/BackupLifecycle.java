/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fsx.model;

import javax.annotation.Generated;

/**
 * <p>
 * The lifecycle status of the backup.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>AVAILABLE</code> - The backup is fully available.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>PENDING</code> - For user-initiated backups on Lustre file systems only; Amazon FSx has not started creating
 * the backup.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CREATING</code> - Amazon FSx is creating the new user-intiated backup
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>TRANSFERRING</code> - For user-initiated backups on Lustre file systems only; Amazon FSx is backing up the file
 * system.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>COPYING</code> - Amazon FSx is copying the backup.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DELETED</code> - Amazon FSx deleted the backup and it is no longer available.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>FAILED</code> - Amazon FSx could not complete the backup.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum BackupLifecycle {

    AVAILABLE("AVAILABLE"),
    CREATING("CREATING"),
    TRANSFERRING("TRANSFERRING"),
    DELETED("DELETED"),
    FAILED("FAILED"),
    PENDING("PENDING"),
    COPYING("COPYING");

    private String value;

    private BackupLifecycle(String value) {
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
     * @return BackupLifecycle corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static BackupLifecycle fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (BackupLifecycle enumEntry : BackupLifecycle.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
