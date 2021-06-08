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
 * Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to create a
 * 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and resamples your audio to
 * keep it synchronized with the video. Note that enabling this setting will slightly reduce the duration of your video.
 * Required settings: You must also set Framerate to 25. In your JSON job specification, set (framerateControl) to
 * (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum H264SlowPal {

    DISABLED("DISABLED"),
    ENABLED("ENABLED");

    private String value;

    private H264SlowPal(String value) {
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
     * @return H264SlowPal corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static H264SlowPal fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (H264SlowPal enumEntry : H264SlowPal.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
