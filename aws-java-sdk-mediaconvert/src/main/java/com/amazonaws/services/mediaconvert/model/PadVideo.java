/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Use this setting if your input has video and audio durations that don't align, and your output or player has strict
 * alignment requirements. Examples: Input audio track has a delayed start. Input video track ends before audio ends.
 * When you set Pad video (padVideo) to Black (BLACK), MediaConvert generates black video frames so that output video
 * and audio durations match. Black video frames are added at the beginning or end, depending on your input. To keep the
 * default behavior and not generate black video, set Pad video to Disabled (DISABLED) or leave blank.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum PadVideo {

    DISABLED("DISABLED"),
    BLACK("BLACK");

    private String value;

    private PadVideo(String value) {
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
     * @return PadVideo corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static PadVideo fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (PadVideo enumEntry : PadVideo.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
