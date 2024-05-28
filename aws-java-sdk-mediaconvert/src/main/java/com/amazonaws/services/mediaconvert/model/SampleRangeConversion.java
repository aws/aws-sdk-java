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
 * Specify how MediaConvert limits the color sample range for this output. To create a limited range output from a full
 * range input: Choose Limited range squeeze. For full range inputs, MediaConvert performs a linear offset to color
 * samples equally across all pixels and frames. Color samples in 10-bit outputs are limited to 64 through 940, and
 * 8-bit outputs are limited to 16 through 235. Note: For limited range inputs, values for color samples are passed
 * through to your output unchanged. MediaConvert does not limit the sample range. To correct pixels in your input that
 * are out of range or out of gamut: Choose Limited range clip. Use for broadcast applications. MediaConvert conforms
 * any pixels outside of the values that you specify under Minimum YUV and Maximum YUV to limited range bounds.
 * MediaConvert also corrects any YUV values that, when converted to RGB, would be outside the bounds you specify under
 * Minimum RGB tolerance and Maximum RGB tolerance. With either limited range conversion, MediaConvert writes the sample
 * range metadata in the output.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum SampleRangeConversion {

    LIMITED_RANGE_SQUEEZE("LIMITED_RANGE_SQUEEZE"),
    NONE("NONE"),
    LIMITED_RANGE_CLIP("LIMITED_RANGE_CLIP");

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
