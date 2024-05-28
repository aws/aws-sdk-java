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
 * Specify how MediaConvert maps brightness and colors from your HDR input to your SDR output. The mode that you select
 * represents a creative choice, with different tradeoffs in the details and tones of your output. To maintain details
 * in bright or saturated areas of your output: Choose Preserve details. For some sources, your SDR output may look less
 * bright and less saturated when compared to your HDR source. MediaConvert automatically applies this mode for HLG
 * sources, regardless of your choice. For a bright and saturated output: Choose Vibrant. We recommend that you choose
 * this mode when any of your source content is HDR10, and for the best results when it is mastered for 1000 nits. You
 * may notice loss of details in bright or saturated areas of your output. HDR to SDR tone mapping has no effect when
 * your input is SDR.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum HDRToSDRToneMapper {

    PRESERVE_DETAILS("PRESERVE_DETAILS"),
    VIBRANT("VIBRANT");

    private String value;

    private HDRToSDRToneMapper(String value) {
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
     * @return HDRToSDRToneMapper corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static HDRToSDRToneMapper fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (HDRToSDRToneMapper enumEntry : HDRToSDRToneMapper.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
