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
package com.amazonaws.services.mediaconvert.model;

import javax.annotation.Generated;

/**
 * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer
 * B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for
 * low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames
 * between reference frames (numberBFramesBetweenReferenceFrames).
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum H264DynamicSubGop {

    ADAPTIVE("ADAPTIVE"),
    STATIC("STATIC");

    private String value;

    private H264DynamicSubGop(String value) {
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
     * @return H264DynamicSubGop corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static H264DynamicSubGop fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (H264DynamicSubGop enumEntry : H264DynamicSubGop.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
