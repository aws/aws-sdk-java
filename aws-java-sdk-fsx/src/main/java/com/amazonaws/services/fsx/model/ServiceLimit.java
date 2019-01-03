/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The types of limits on your service utilization. Limits include file system count, total throughput capacity, total
 * storage, and total user-initiated backups. These limits apply for a specific account in a specific AWS Region. You
 * can increase some of them by contacting AWS Support.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ServiceLimit {

    FILE_SYSTEM_COUNT("FILE_SYSTEM_COUNT"),
    TOTAL_THROUGHPUT_CAPACITY("TOTAL_THROUGHPUT_CAPACITY"),
    TOTAL_STORAGE("TOTAL_STORAGE"),
    TOTAL_USER_INITIATED_BACKUPS("TOTAL_USER_INITIATED_BACKUPS");

    private String value;

    private ServiceLimit(String value) {
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
     * @return ServiceLimit corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ServiceLimit fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ServiceLimit enumEntry : ServiceLimit.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
