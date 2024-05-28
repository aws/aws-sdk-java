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
 * Specify the video Scaling behavior when your output has a different resolution than your input. For more information,
 * see https://docs.aws.amazon.com/mediaconvert/latest/ug/video-scaling.html
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ScalingBehavior {

    DEFAULT("DEFAULT"),
    STRETCH_TO_OUTPUT("STRETCH_TO_OUTPUT"),
    FIT("FIT"),
    FIT_NO_UPSCALE("FIT_NO_UPSCALE"),
    FILL("FILL");

    private String value;

    private ScalingBehavior(String value) {
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
     * @return ScalingBehavior corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ScalingBehavior fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ScalingBehavior enumEntry : ScalingBehavior.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
