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
 * When set to VIDEO_AND_FIXED_INTERVALS, audio EBP markers will be added to partitions 3 and 4. The interval between
 * these additional markers will be fixed, and will be slightly shorter than the video EBP marker interval. When set to
 * VIDEO_INTERVAL, these additional markers will not be inserted. Only applicable when EBP segmentation markers are is
 * selected (segmentationMarkers is EBP or EBP_LEGACY).
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum M2tsEbpAudioInterval {

    VIDEO_AND_FIXED_INTERVALS("VIDEO_AND_FIXED_INTERVALS"),
    VIDEO_INTERVAL("VIDEO_INTERVAL");

    private String value;

    private M2tsEbpAudioInterval(String value) {
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
     * @return M2tsEbpAudioInterval corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static M2tsEbpAudioInterval fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (M2tsEbpAudioInterval enumEntry : M2tsEbpAudioInterval.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
