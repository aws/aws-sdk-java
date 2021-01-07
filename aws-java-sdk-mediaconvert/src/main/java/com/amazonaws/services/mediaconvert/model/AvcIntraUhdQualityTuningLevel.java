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
 * Optional. Use Quality tuning level (qualityTuningLevel) to choose how many transcoding passes MediaConvert does with
 * your video. When you choose Multi-pass (MULTI_PASS), your video quality is better and your output bitrate is more
 * accurate. That is, the actual bitrate of your output is closer to the target bitrate defined in the specification.
 * When you choose Single-pass (SINGLE_PASS), your encoding time is faster. The default behavior is Single-pass
 * (SINGLE_PASS).
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum AvcIntraUhdQualityTuningLevel {

    SINGLE_PASS("SINGLE_PASS"),
    MULTI_PASS("MULTI_PASS");

    private String value;

    private AvcIntraUhdQualityTuningLevel(String value) {
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
     * @return AvcIntraUhdQualityTuningLevel corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static AvcIntraUhdQualityTuningLevel fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (AvcIntraUhdQualityTuningLevel enumEntry : AvcIntraUhdQualityTuningLevel.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
