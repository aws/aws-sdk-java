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
package com.amazonaws.services.mediaconvert.model;

import javax.annotation.Generated;

/**
 * Specify the video color sample range for this output. To create a full range output, you must start with a full range
 * YUV input and keep the default value, None (NONE). To create a limited range output from a full range input, choose
 * Limited range (LIMITED_RANGE_SQUEEZE). With RGB inputs, your output is always limited range, regardless of your
 * choice here. When you create a limited range output from a full range input, MediaConvert limits the active pixel
 * values in a way that depends on the output's bit depth: 8-bit outputs contain only values from 16 through 235 and
 * 10-bit outputs contain only values from 64 through 940. With this conversion, MediaConvert also changes the output
 * metadata to note the limited range.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum SampleRangeConversion {

    LIMITED_RANGE_SQUEEZE("LIMITED_RANGE_SQUEEZE"),
    NONE("NONE");

    private String value;

    private SampleRangeConversion(String value) {
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
     * @return SampleRangeConversion corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static SampleRangeConversion fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (SampleRangeConversion enumEntry : SampleRangeConversion.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
