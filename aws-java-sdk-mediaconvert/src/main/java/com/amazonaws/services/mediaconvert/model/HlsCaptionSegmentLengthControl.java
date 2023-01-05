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
 * Set Caption segment length control (CaptionSegmentLengthControl) to Match video (MATCH_VIDEO) to create caption
 * segments that align with the video segments from the first video output in this output group. For example, if the
 * video segments are 2 seconds long, your WebVTT segments will also be 2 seconds long. Keep the default setting, Large
 * segments (LARGE_SEGMENTS) to create caption segments that are 300 seconds long.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum HlsCaptionSegmentLengthControl {

    LARGE_SEGMENTS("LARGE_SEGMENTS"),
    MATCH_VIDEO("MATCH_VIDEO");

    private String value;

    private HlsCaptionSegmentLengthControl(String value) {
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
     * @return HlsCaptionSegmentLengthControl corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static HlsCaptionSegmentLengthControl fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (HlsCaptionSegmentLengthControl enumEntry : HlsCaptionSegmentLengthControl.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
