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
 * Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using
 * drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex
 * conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might
 * introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has
 * already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated
 * interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases
 * the transcoding time and incurs a significant add-on cost.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum Av1FramerateConversionAlgorithm {

    DUPLICATE_DROP("DUPLICATE_DROP"),
    INTERPOLATE("INTERPOLATE"),
    FRAMEFORMER("FRAMEFORMER");

    private String value;

    private Av1FramerateConversionAlgorithm(String value) {
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
     * @return Av1FramerateConversionAlgorithm corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static Av1FramerateConversionAlgorithm fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (Av1FramerateConversionAlgorithm enumEntry : Av1FramerateConversionAlgorithm.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
