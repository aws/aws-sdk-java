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
 * Use this setting only when your output video stream has B-frames, which causes the initial presentation time stamp
 * (PTS) to be offset from the initial decode time stamp (DTS). Specify how MediaConvert handles PTS when writing time
 * stamps in output DASH manifests. Choose Match initial PTS (MATCH_INITIAL_PTS) when you want MediaConvert to use the
 * initial PTS as the first time stamp in the manifest. Choose Zero-based (ZERO_BASED) to have MediaConvert ignore the
 * initial PTS in the video stream and instead write the initial time stamp as zero in the manifest. For outputs that
 * don't have B-frames, the time stamps in your DASH manifests start at zero regardless of your choice here.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum CmafPtsOffsetHandlingForBFrames {

    ZERO_BASED("ZERO_BASED"),
    MATCH_INITIAL_PTS("MATCH_INITIAL_PTS");

    private String value;

    private CmafPtsOffsetHandlingForBFrames(String value) {
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
     * @return CmafPtsOffsetHandlingForBFrames corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static CmafPtsOffsetHandlingForBFrames fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (CmafPtsOffsetHandlingForBFrames enumEntry : CmafPtsOffsetHandlingForBFrames.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
