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
package com.amazonaws.services.mediaconvert.model;

import javax.annotation.Generated;

/**
 * Specify the initial presentation timestamp (PTS) offset for your transport stream output. To let MediaConvert
 * automatically determine the initial PTS offset: Keep the default value, Auto. We recommend that you choose Auto for
 * the widest player compatibility. The initial PTS will be at least two seconds and vary depending on your output's
 * bitrate, HRD buffer size and HRD buffer initial fill percentage. To manually specify an initial PTS offset: Choose
 * Seconds. Then specify the number of seconds with PTS offset.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum TsPtsOffset {

    AUTO("AUTO"),
    SECONDS("SECONDS");

    private String value;

    private TsPtsOffset(String value) {
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
     * @return TsPtsOffset corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static TsPtsOffset fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (TsPtsOffset enumEntry : TsPtsOffset.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
