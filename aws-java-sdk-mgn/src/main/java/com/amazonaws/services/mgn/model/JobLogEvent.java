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
package com.amazonaws.services.mgn.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum JobLogEvent {

    JOB_START("JOB_START"),
    SERVER_SKIPPED("SERVER_SKIPPED"),
    CLEANUP_START("CLEANUP_START"),
    CLEANUP_END("CLEANUP_END"),
    CLEANUP_FAIL("CLEANUP_FAIL"),
    SNAPSHOT_START("SNAPSHOT_START"),
    SNAPSHOT_END("SNAPSHOT_END"),
    SNAPSHOT_FAIL("SNAPSHOT_FAIL"),
    USING_PREVIOUS_SNAPSHOT("USING_PREVIOUS_SNAPSHOT"),
    CONVERSION_START("CONVERSION_START"),
    CONVERSION_END("CONVERSION_END"),
    CONVERSION_FAIL("CONVERSION_FAIL"),
    LAUNCH_START("LAUNCH_START"),
    LAUNCH_FAILED("LAUNCH_FAILED"),
    JOB_CANCEL("JOB_CANCEL"),
    JOB_END("JOB_END");

    private String value;

    private JobLogEvent(String value) {
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
     * @return JobLogEvent corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static JobLogEvent fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (JobLogEvent enumEntry : JobLogEvent.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
