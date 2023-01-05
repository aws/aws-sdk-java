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
 * Specify how the transcoder determines GOP size for this output. We recommend that you have the transcoder
 * automatically choose this value for you based on characteristics of your input video. To enable this automatic
 * behavior, choose Auto (AUTO) and and leave GOP size (GopSize) blank. By default, if you don't specify GOP mode
 * control (GopSizeUnits), MediaConvert will use automatic behavior. If your output group specifies HLS, DASH, or CMAF,
 * set GOP mode control to Auto and leave GOP size blank in each output in your output group. To explicitly specify the
 * GOP length, choose Specified, frames (FRAMES) or Specified, seconds (SECONDS) and then provide the GOP length in the
 * related setting GOP size (GopSize).
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum H264GopSizeUnits {

    FRAMES("FRAMES"),
    SECONDS("SECONDS"),
    AUTO("AUTO");

    private String value;

    private H264GopSizeUnits(String value) {
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
     * @return H264GopSizeUnits corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static H264GopSizeUnits fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (H264GopSizeUnits enumEntry : H264GopSizeUnits.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
