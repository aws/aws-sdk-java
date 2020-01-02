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
package com.amazonaws.services.mediaconvert.model;

import javax.annotation.Generated;

/**
 * Describes whether the current job is running with accelerated transcoding. For jobs that have Acceleration
 * (AccelerationMode) set to DISABLED, AccelerationStatus is always NOT_APPLICABLE. For jobs that have Acceleration
 * (AccelerationMode) set to ENABLED or PREFERRED, AccelerationStatus is one of the other states. AccelerationStatus is
 * IN_PROGRESS initially, while the service determines whether the input files and job settings are compatible with
 * accelerated transcoding. If they are, AcclerationStatus is ACCELERATED. If your input files and job settings aren't
 * compatible with accelerated transcoding, the service either fails your job or runs it without accelerated
 * transcoding, depending on how you set Acceleration (AccelerationMode). When the service runs your job without
 * accelerated transcoding, AccelerationStatus is NOT_ACCELERATED.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum AccelerationStatus {

    NOT_APPLICABLE("NOT_APPLICABLE"),
    IN_PROGRESS("IN_PROGRESS"),
    ACCELERATED("ACCELERATED"),
    NOT_ACCELERATED("NOT_ACCELERATED");

    private String value;

    private AccelerationStatus(String value) {
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
     * @return AccelerationStatus corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static AccelerationStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (AccelerationStatus enumEntry : AccelerationStatus.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
