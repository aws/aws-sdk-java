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
 * Only applies when you set Deinterlace mode to Deinterlace or Adaptive. Interpolate produces sharper pictures, while
 * blend produces smoother motion. If your source file includes a ticker, such as a scrolling headline at the bottom of
 * the frame: Choose Interpolate ticker or Blend ticker. To apply field doubling: Choose Linear interpolation. Note that
 * Linear interpolation may introduce video artifacts into your output.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DeinterlaceAlgorithm {

    INTERPOLATE("INTERPOLATE"),
    INTERPOLATE_TICKER("INTERPOLATE_TICKER"),
    BLEND("BLEND"),
    BLEND_TICKER("BLEND_TICKER"),
    LINEAR_INTERPOLATION("LINEAR_INTERPOLATION");

    private String value;

    private DeinterlaceAlgorithm(String value) {
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
     * @return DeinterlaceAlgorithm corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DeinterlaceAlgorithm fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DeinterlaceAlgorithm enumEntry : DeinterlaceAlgorithm.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
